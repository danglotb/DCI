
import toolbox
import xml.etree.ElementTree as ET

xml_namespace = 'http://maven.apache.org/POM/4.0.0'
xml_prefix = '{' + xml_namespace + '}'
xml_build_tag = xml_prefix + 'build'
xml_plugins_tag = xml_prefix + 'plugins'
xml_plugin_management_tag = xml_prefix + 'pluginManagement'
xml_group_id_tag = xml_prefix + 'groupId'
xml_artifact_id_tag = xml_prefix + 'artifactId'
xml_configuration_tag = xml_prefix + 'configuration'
xml_includes_test_source_roots_tag = xml_prefix + 'includesTestSourceRoots'
xml_properties_tag = xml_prefix + 'properties'
xml_xwiki_enforcer_skip_tag = xml_prefix + 'xwiki.enforcer.skip'

def prepare(project):
    if project == "xwiki-commons":
        set_true_include_test_roots(project)

def set_true_include_test_roots(project):
    ET.register_namespace('', xml_namespace)
    path_to_root_pom = toolbox.prefix_dataset + "/" + project + "/pom.xml"
    tree = ET.parse(path_to_root_pom)
    root_pom = tree.getroot()
    root_pom.findall(xml_properties_tag)[0].findall(xml_xwiki_enforcer_skip_tag)[0].text = "true"
    current_xml = root_pom.findall(xml_build_tag)[0].findall(xml_plugin_management_tag)[0].findall(xml_plugins_tag)[0]
    for child in current_xml:
        group_id = child.findall(xml_group_id_tag)[0].text
        artifact_id = child.findall(xml_artifact_id_tag)[0].text
        if group_id == 'org.openclover' and artifact_id == 'clover-maven-plugin':
            child.findall(xml_configuration_tag)[0].findall(xml_includes_test_source_roots_tag)[0].text = "true"
    tree.write(path_to_root_pom)

    path_to_root_pom = toolbox.prefix_dataset + "/" + project + toolbox.suffix_parent + "/pom.xml"
    tree = ET.parse(path_to_root_pom )
    root_pom = tree.getroot()
    root_pom.findall(xml_properties_tag)[0].findall(xml_xwiki_enforcer_skip_tag)[0].text = "true"
    tree.write(path_to_root_pom)

def add_needed_options(cmd, project):
    if project == "xwiki-commons":
        cmd.append("-Duse-maven-to-exe-test=true")
    return cmd