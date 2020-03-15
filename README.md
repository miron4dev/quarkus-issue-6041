# Test project to reproduce https://github.com/quarkusio/quarkus/issues/6041

## How to reproduce
Execute `./test.sh`

## Expected behavior
Lambda should return some response

## Actual behavior
```java
com.fasterxml.jackson.databind.exc.InvalidDefinitionException: Cannot construct instance of `com.miron4dev.TestModel` (no Creators, like default construct, exist): cannot deserialize from Object value (no delegate- or property-based Creator)
 at [Source: (lambdainternal.util.NativeMemoryAsInputStream); line: 2, column: 3]
        at com.fasterxml.jackson.databind.exc.InvalidDefinitionException.from(InvalidDefinitionException.java:67)
        at com.fasterxml.jackson.databind.DeserializationContext.reportBadDefinition(DeserializationContext.java:1589)
        at com.fasterxml.jackson.databind.DeserializationContext.handleMissingInstantiator(DeserializationContext.java:1055)
        at com.fasterxml.jackson.databind.deser.BeanDeserializerBase.deserializeFromObjectUsingNonDefault(BeanDeserializerBase.java:1297)
        at com.fasterxml.jackson.databind.deser.BeanDeserializer.deserializeFromObject(BeanDeserializer.java:326)
        at com.fasterxml.jackson.databind.deser.BeanDeserializer.deserialize(BeanDeserializer.java:159)
        at com.fasterxml.jackson.databind.ObjectReader._bindAndClose(ObjectReader.java:1719)
        at com.fasterxml.jackson.databind.ObjectReader.readValue(ObjectReader.java:1228)
        at io.quarkus.amazon.lambda.runtime.AmazonLambdaRecorder.handle(AmazonLambdaRecorder.java:77)
        at io.quarkus.amazon.lambda.runtime.QuarkusStreamHandler.handleRequest(QuarkusStreamHandler.java:58)
        at sun.reflect.NativeMethodAccessorImpl.invoke0(Native Method)
        at sun.reflect.NativeMethodAccessorImpl.invoke(NativeMethodAccessorImpl.java:62)
        at sun.reflect.DelegatingMethodAccessorImpl.invoke(DelegatingMethodAccessorImpl.java:43)
        at java.lang.reflect.Method.invoke(Method.java:498)
```
