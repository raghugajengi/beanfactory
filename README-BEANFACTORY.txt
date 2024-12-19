Spring – BeanFactory

BeanFactory interface is the simplest container providing an advanced configuration mechanism to instantiate, 
configure, and manage the life cycle of beans.

Beans are Java objects that are configured at run-time by Spring IoC Container.
BeanFactory represents a basic IoC container which is a parent interface of ApplicationContext.

Let us first go through some of the methods of Bean Factory before landing up on implementation which are shown below in tabular format:

Method

Description

containsBean(String name)	Does this bean factory contain a bean definition or externally registered singleton instance with the given name?
getAliases(String name)	Return the aliases for the given bean name, if any.
getBean(Class<T> requiredType)	Return the bean instance that uniquely matches the given object type, if any.
getBean(Class<T> requiredType, Object… args)	Return an instance, which may be shared or independent, of the specified bean.
getBean(String name)	Return an instance, which may be shared or independent, of the specified bean.
getBean(String name, Class<T> requiredType)	Return an instance, which may be shared or independent, of the specified bean.
getBean(String name, Object… args)	Return an instance, which may be shared or independent, of the specified bean.
getBeanProvider(Class<T> requiredType)	Return a provider for the specified bean, allowing for lazy on-demand retrieval of instances, including availability and uniqueness options.
getBeanProvider(ResolvableType requiredType)	Return a provider for the specified bean, allowing for lazy on-demand retrieval of instances, including availability and uniqueness options.
getType(String name)	Determine the type of the bean with the given name.
getType(String name, boolean allowFactoryBeanInit)	Determine the type of the bean with the given name.
isPrototype(String name)	Is this bean a prototype? That is, will getBean(java.lang.String) always return independent instances?
isSingleton(String name)	Is this bean a shared singleton? That is, will getBean(java.lang.String) always return the same instance?
isTypeMatch(String name, Class<?> typeToMatch)	Check whether the bean with the given name matches the specified type.
isTypeMatch(String name, ResolvableType typeToMatch)	Check whether the bean with the given name matches the specified type.

