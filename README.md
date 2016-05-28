# How to use pre-defined WSDL resource for ?wsdl

1. Add dependency on "org.apache.cxf:cxf-rt-frontends-jaxws:{cxf.version}".
2. Add @WebService annotation with wsdlLocation set to arbitrary URI to implementor class.
3. Add /META-INF/jax-ws-catalog.xml to resources.
4. Add WSDL file to resources and reference it from catalog using a relative URL.

The WSDL and catalog files have to be in the same JAR file.
Otherwise the relative URL does not work.

## References

1. [JAX-WS client : what's the correct path to access the local WSDL?](http://stackoverflow.com/questions/4163586/jax-ws-client-whats-the-correct-path-to-access-the-local-wsdl)
1. [JAX-WS RI 2.1.2 M1 -- Catalog Support](https://jax-ws.java.net/nonav/2.1.2m1/docs/catalog-support.html)
1. [cxf-users mailing list archives: Re: Unable to Localise WSDL fille](http://mail-archives.apache.org/mod_mbox/cxf-users/201204.mbox/%3CCAF8t5XvEniijRwuph+ri6SqqG5TO8cwYnfmss9_OhVyHm7kS4A@mail.gmail.com%3E)
