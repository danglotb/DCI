package com.google.gson.internal;


import java.lang.reflect.AnnotatedType;
import java.lang.reflect.Method;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.security.CodeSource;
import java.security.PermissionCollection;
import java.security.ProtectionDomain;
import java.util.List;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;


public final class AmplGsonTypesTest {
    @Test(timeout = 10000)
    public void testNewParameterizedTypeWithoutOwner() throws Exception {
        Type type = $Gson$Types.newParameterizedTypeWithOwner(null, List.class, AmplGsonTypesTest.A.class);
        Type o_testNewParameterizedTypeWithoutOwner__4 = AmplGsonTypesTest.getFirstTypeArgument(type);
        Assert.assertEquals("class com.google.gson.internal.AmplGsonTypesTest$A", ((Class) (o_testNewParameterizedTypeWithoutOwner__4)).toString());
        Assert.assertEquals("(file:/tmp/icst-2019/september-2018/dataset/gson_parent/gson/target/test-classes/ <no signer certificates>)", ((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getProtectionDomain())).getCodeSource())).toString());
        Assert.assertEquals(2006847949, ((int) (((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getProtectionDomain())).getCodeSource())).hashCode())));
        Assert.assertNull(((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getProtectionDomain())).getCodeSource())).getCertificates());
        Assert.assertNull(((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getProtectionDomain())).getCodeSource())).getCodeSigners());
        Assert.assertTrue(((PermissionCollection) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getProtectionDomain())).getPermissions())).isReadOnly());
        Assert.assertEquals(26, ((int) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getModifiers())));
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isInterface());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isArray());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isPrimitive());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest$A", ((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getName());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isAnnotation());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isSynthetic());
        Assert.assertNull(((ClassLoader) (((ClassLoader) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getClassLoader())).getParent())).getParent());
        Assert.assertEquals("java.lang.Object", ((Type) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getGenericSuperclass())).getTypeName());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getSpecificationTitle());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getSpecificationVersion());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getSpecificationVendor());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getImplementationTitle());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getImplementationVersion());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getImplementationVendor());
        Assert.assertEquals("package com.google.gson.internal", ((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).toString());
        Assert.assertEquals(614253784, ((int) (((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).hashCode())));
        Assert.assertEquals("com.google.gson.internal", ((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getName());
        Assert.assertFalse(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).isSealed());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getSigners());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getEnclosingMethod());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getEnclosingConstructor());
        Assert.assertEquals("A", ((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getSimpleName());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest$A", ((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getTypeName());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest.A", ((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getCanonicalName());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isAnonymousClass());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isLocalClass());
        Assert.assertTrue(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isMemberClass());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isEnum());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getEnumConstants());
        Assert.assertEquals("java.lang.Object", ((Type) (((AnnotatedType) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getAnnotatedSuperclass())).getType())).getTypeName());
        type = $Gson$Types.newParameterizedTypeWithOwner(null, AmplGsonTypesTest.A.class, AmplGsonTypesTest.B.class);
        Type o_testNewParameterizedTypeWithoutOwner__8 = AmplGsonTypesTest.getFirstTypeArgument(type);
        Assert.assertEquals("class com.google.gson.internal.AmplGsonTypesTest$B", ((Class) (o_testNewParameterizedTypeWithoutOwner__8)).toString());
        Assert.assertEquals("(file:/tmp/icst-2019/september-2018/dataset/gson_parent/gson/target/test-classes/ <no signer certificates>)", ((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getProtectionDomain())).getCodeSource())).toString());
        Assert.assertEquals(2006847949, ((int) (((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getProtectionDomain())).getCodeSource())).hashCode())));
        Assert.assertNull(((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getProtectionDomain())).getCodeSource())).getCertificates());
        Assert.assertNull(((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getProtectionDomain())).getCodeSource())).getCodeSigners());
        Assert.assertTrue(((PermissionCollection) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getProtectionDomain())).getPermissions())).isReadOnly());
        Assert.assertEquals(26, ((int) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getModifiers())));
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isInterface());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isArray());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isPrimitive());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest$B", ((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getName());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isAnnotation());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isSynthetic());
        Assert.assertNull(((ClassLoader) (((ClassLoader) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getClassLoader())).getParent())).getParent());
        Assert.assertEquals("java.lang.Object", ((Type) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getGenericSuperclass())).getTypeName());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getSpecificationTitle());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getSpecificationVersion());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getSpecificationVendor());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getImplementationTitle());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getImplementationVersion());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getImplementationVendor());
        Assert.assertEquals("package com.google.gson.internal", ((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).toString());
        Assert.assertEquals(614253784, ((int) (((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).hashCode())));
        Assert.assertEquals("com.google.gson.internal", ((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getName());
        Assert.assertFalse(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).isSealed());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getSigners());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getEnclosingMethod());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getEnclosingConstructor());
        Assert.assertEquals("B", ((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getSimpleName());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest$B", ((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getTypeName());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest.B", ((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getCanonicalName());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isAnonymousClass());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isLocalClass());
        Assert.assertTrue(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isMemberClass());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isEnum());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getEnumConstants());
        Assert.assertEquals("java.lang.Object", ((Type) (((AnnotatedType) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getAnnotatedSuperclass())).getType())).getTypeName());
        final class D {}
        try {
            $Gson$Types.newParameterizedTypeWithOwner(null, D.class, AmplGsonTypesTest.A.class);
        } catch (IllegalArgumentException expected) {
        }
        type = $Gson$Types.newParameterizedTypeWithOwner(null, AmplGsonTypesTest.A.class, D.class);
        Type o_testNewParameterizedTypeWithoutOwner__20 = AmplGsonTypesTest.getFirstTypeArgument(type);
        Assert.assertEquals("(file:/tmp/icst-2019/september-2018/dataset/gson_parent/gson/target/test-classes/ <no signer certificates>)", ((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getProtectionDomain())).getCodeSource())).toString());
        Assert.assertEquals(2006847949, ((int) (((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getProtectionDomain())).getCodeSource())).hashCode())));
        Assert.assertNull(((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getProtectionDomain())).getCodeSource())).getCertificates());
        Assert.assertNull(((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getProtectionDomain())).getCodeSource())).getCodeSigners());
        Assert.assertTrue(((PermissionCollection) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getProtectionDomain())).getPermissions())).isReadOnly());
        Assert.assertEquals(16, ((int) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getModifiers())));
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).isInterface());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).isArray());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).isPrimitive());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).isAnnotation());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).isSynthetic());
        Assert.assertNull(((ClassLoader) (((ClassLoader) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getClassLoader())).getParent())).getParent());
        Assert.assertEquals("java.lang.Object", ((Type) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getGenericSuperclass())).getTypeName());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getPackage())).getSpecificationTitle());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getPackage())).getSpecificationVersion());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getPackage())).getSpecificationVendor());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getPackage())).getImplementationTitle());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getPackage())).getImplementationVersion());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getPackage())).getImplementationVendor());
        Assert.assertEquals("package com.google.gson.internal", ((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getPackage())).toString());
        Assert.assertEquals(614253784, ((int) (((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getPackage())).hashCode())));
        Assert.assertEquals("com.google.gson.internal", ((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getPackage())).getName());
        Assert.assertFalse(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getPackage())).isSealed());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getSigners());
        Assert.assertEquals(1, ((int) (((Method) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnclosingMethod())).getModifiers())));
        Assert.assertFalse(((Method) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnclosingMethod())).isSynthetic());
        Assert.assertFalse(((Method) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnclosingMethod())).isDefault());
        Assert.assertFalse(((Method) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnclosingMethod())).isVarArgs());
        Assert.assertEquals(0, ((int) (((Method) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnclosingMethod())).getParameterCount())));
        Assert.assertEquals("void", ((Type) (((Method) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnclosingMethod())).getGenericReturnType())).getTypeName());
        Assert.assertFalse(((Method) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnclosingMethod())).isBridge());
        Assert.assertNull(((Method) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnclosingMethod())).getDefaultValue());
        Assert.assertFalse(((Method) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnclosingMethod())).isAccessible());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnclosingConstructor());
        Assert.assertEquals("D", ((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getSimpleName());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getCanonicalName());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).isAnonymousClass());
        Assert.assertTrue(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).isLocalClass());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).isMemberClass());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).isEnum());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getEnumConstants());
        Assert.assertEquals("java.lang.Object", ((Type) (((AnnotatedType) (((Class) (o_testNewParameterizedTypeWithoutOwner__20)).getAnnotatedSuperclass())).getType())).getTypeName());
        Assert.assertEquals("class com.google.gson.internal.AmplGsonTypesTest$A", ((Class) (o_testNewParameterizedTypeWithoutOwner__4)).toString());
        Assert.assertEquals("(file:/tmp/icst-2019/september-2018/dataset/gson_parent/gson/target/test-classes/ <no signer certificates>)", ((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getProtectionDomain())).getCodeSource())).toString());
        Assert.assertEquals(2006847949, ((int) (((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getProtectionDomain())).getCodeSource())).hashCode())));
        Assert.assertNull(((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getProtectionDomain())).getCodeSource())).getCertificates());
        Assert.assertNull(((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getProtectionDomain())).getCodeSource())).getCodeSigners());
        Assert.assertTrue(((PermissionCollection) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getProtectionDomain())).getPermissions())).isReadOnly());
        Assert.assertEquals(26, ((int) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getModifiers())));
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isInterface());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isArray());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isPrimitive());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest$A", ((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getName());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isAnnotation());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isSynthetic());
        Assert.assertNull(((ClassLoader) (((ClassLoader) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getClassLoader())).getParent())).getParent());
        Assert.assertEquals("java.lang.Object", ((Type) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getGenericSuperclass())).getTypeName());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getSpecificationTitle());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getSpecificationVersion());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getSpecificationVendor());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getImplementationTitle());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getImplementationVersion());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getImplementationVendor());
        Assert.assertEquals("package com.google.gson.internal", ((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).toString());
        Assert.assertEquals(614253784, ((int) (((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).hashCode())));
        Assert.assertEquals("com.google.gson.internal", ((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).getName());
        Assert.assertFalse(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getPackage())).isSealed());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getSigners());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getEnclosingMethod());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getEnclosingConstructor());
        Assert.assertEquals("A", ((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getSimpleName());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest$A", ((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getTypeName());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest.A", ((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getCanonicalName());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isAnonymousClass());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isLocalClass());
        Assert.assertTrue(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isMemberClass());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).isEnum());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getEnumConstants());
        Assert.assertEquals("java.lang.Object", ((Type) (((AnnotatedType) (((Class) (o_testNewParameterizedTypeWithoutOwner__4)).getAnnotatedSuperclass())).getType())).getTypeName());
        Assert.assertEquals("class com.google.gson.internal.AmplGsonTypesTest$B", ((Class) (o_testNewParameterizedTypeWithoutOwner__8)).toString());
        Assert.assertEquals("(file:/tmp/icst-2019/september-2018/dataset/gson_parent/gson/target/test-classes/ <no signer certificates>)", ((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getProtectionDomain())).getCodeSource())).toString());
        Assert.assertEquals(2006847949, ((int) (((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getProtectionDomain())).getCodeSource())).hashCode())));
        Assert.assertNull(((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getProtectionDomain())).getCodeSource())).getCertificates());
        Assert.assertNull(((CodeSource) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getProtectionDomain())).getCodeSource())).getCodeSigners());
        Assert.assertTrue(((PermissionCollection) (((ProtectionDomain) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getProtectionDomain())).getPermissions())).isReadOnly());
        Assert.assertEquals(26, ((int) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getModifiers())));
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isInterface());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isArray());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isPrimitive());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest$B", ((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getName());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isAnnotation());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isSynthetic());
        Assert.assertNull(((ClassLoader) (((ClassLoader) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getClassLoader())).getParent())).getParent());
        Assert.assertEquals("java.lang.Object", ((Type) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getGenericSuperclass())).getTypeName());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getSpecificationTitle());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getSpecificationVersion());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getSpecificationVendor());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getImplementationTitle());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getImplementationVersion());
        Assert.assertNull(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getImplementationVendor());
        Assert.assertEquals("package com.google.gson.internal", ((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).toString());
        Assert.assertEquals(614253784, ((int) (((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).hashCode())));
        Assert.assertEquals("com.google.gson.internal", ((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).getName());
        Assert.assertFalse(((Package) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getPackage())).isSealed());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getSigners());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getEnclosingMethod());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getEnclosingConstructor());
        Assert.assertEquals("B", ((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getSimpleName());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest$B", ((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getTypeName());
        Assert.assertEquals("com.google.gson.internal.AmplGsonTypesTest.B", ((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getCanonicalName());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isAnonymousClass());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isLocalClass());
        Assert.assertTrue(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isMemberClass());
        Assert.assertFalse(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).isEnum());
        Assert.assertNull(((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getEnumConstants());
        Assert.assertEquals("java.lang.Object", ((Type) (((AnnotatedType) (((Class) (o_testNewParameterizedTypeWithoutOwner__8)).getAnnotatedSuperclass())).getType())).getTypeName());
    }

    private static final class A {}

    private static final class B {}

    private static final class C {}

    public static Type getFirstTypeArgument(Type type) throws Exception {
        if (!(type instanceof ParameterizedType))
            return null;

        ParameterizedType ptype = ((ParameterizedType) (type));
        Type[] actualTypeArguments = ptype.getActualTypeArguments();
        if ((actualTypeArguments.length) == 0)
            return null;

        return $Gson$Types.canonicalize(actualTypeArguments[0]);
    }
}

