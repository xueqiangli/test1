# test1
测试用的

# 增加了生成gradle依赖的代码
以后得好好学习，争取多写点源码出来，提升自己同时帮助到别人

# 基本使用

# 1.添加 Gradle （以前是有的是Jecenter方式引入，由于国内被墙了，切换成JitPack方式引入，使用方式不变）

# Jitpack 

Step 1.Add it in your root build.gradle at the end of repositories:

```
allprojects {
     repositories {
	...
	maven { url 'https://jitpack.io' }
     }
}
```

Step 2. Add the dependency

```
dependencies {

   implementation 'com.github.xueqiangli:test1:Tag'
}
```


# 2.在清单文件中添加网络权限

```
<uses-permission android:name="android.permission.INTERNET" />
```
