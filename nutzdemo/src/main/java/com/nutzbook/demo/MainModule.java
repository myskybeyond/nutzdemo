package com.nutzbook.demo;

import com.sun.org.apache.xalan.internal.xsltc.cmdline.Compile;
import org.nutz.mvc.annotation.IocBy;
import org.nutz.mvc.annotation.Modules;
import org.nutz.mvc.annotation.SetupBy;
import org.nutz.mvc.ioc.provider.ComboIocProvider;

@SetupBy(value = MainSetup.class)
@IocBy(type = ComboIocProvider.class,args = {"*js","com/nutzbook/config/","*anno","com.nutzbook.demo","*tx","*async"})
@Modules(scanPackage = true)
public class MainModule {
}
