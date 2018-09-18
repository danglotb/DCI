package org.xwiki.job.internal;


import java.io.File;
import java.io.IOException;
import java.util.Objects;
import javax.inject.Provider;
import javax.xml.parsers.ParserConfigurationException;
import org.junit.Before;
import org.xwiki.job.annotation.Serializable;
import org.xwiki.job.event.status.JobStatus;


public class AmplJobStatusSerializerTest {
    private JobStatusSerializer serializer;

    private File testFile = new File("target/test/status.xml");

    @Serializable
    private static class SerializableCrossReferenceObject {
        public AmplJobStatusSerializerTest.SerializableCrossReferenceObject field;

        public SerializableCrossReferenceObject() {
            this.field = this;
        }
    }

    @Serializable
    private static class SerializableObjectTest {
        public Object field;

        public SerializableObjectTest(Object field) {
            this.field = field;
        }
    }

    @Serializable
    private static class CustomSerializableObject {
        public String field;

        public CustomSerializableObject(String field) {
            this.field = field;
        }

        @Override
        public boolean equals(Object obj) {
            return Objects.equals(((AmplJobStatusSerializerTest.CustomSerializableObject) (obj)).field, this.field);
        }
    }

    @Serializable
    private static class SerializableCustomObject {
        public String field;

        public SerializableCustomObject(String field) {
            this.field = field;
        }

        @Override
        public boolean equals(Object obj) {
            return Objects.equals(((AmplJobStatusSerializerTest.SerializableCustomObject) (obj)).field, this.field);
        }
    }

    @Serializable(false)
    private static class NotSerializableCustomObject {
        public String field;

        public NotSerializableCustomObject(String field) {
            this.field = field;
        }

        @Override
        public boolean equals(Object obj) {
            return Objects.equals(((AmplJobStatusSerializerTest.NotSerializableCustomObject) (obj)).field, this.field);
        }

        @Override
        public String toString() {
            return this.field;
        }
    }

    @Serializable
    private static class SerializableProvider implements Provider<String> {
        @Override
        public String get() {
            return null;
        }
    }

    private static class SerializableImplementationProvider implements java.io.Serializable , Provider<String> {
        private static final long serialVersionUID = 1L;

        @Override
        public String get() {
            return null;
        }
    }

    private static class TestException extends Exception {
        private Object custom;

        public TestException(String message, Throwable cause, Object custom) {
            super(message, cause);
            this.custom = custom;
        }

        public Object getCustom() {
            return this.custom;
        }
    }

    @Before
    public void before() throws ParserConfigurationException {
        this.serializer = new JobStatusSerializer();
    }

    private JobStatus writeread(JobStatus status) throws IOException {
        this.serializer.write(status, this.testFile);
        return this.serializer.read(this.testFile);
    }
}

