# TabLayout
[ ![Download](https://api.bintray.com/packages/knight/maven/tablayout/images/download.svg?version=1.0.5) ](https://bintray.com/knight/maven/tablayout/1.0.5/link)

TabLayout is a library that bases on android.support.design.widget.TabLayout.The purpose of rewriting this class is to add some new function,just like animation and indictor's width and etc.


# Setup

In your module build.gradle:

```gradle
dependencies{
    implementation 'com.knight:tablayout:1.0.5'
}
```

# Comparison

This library's usage is same as Google's TabLayout,but add same new function:

* tabIndicatorAnimation
* tabIndicatorFullWidth
* tabIndicatorWidthPercent
* tabViewHalfVisible

Browse the native effects of Google's TabLayout

![](https://raw.githubusercontent.com/296777513/Picture/master/TabLayout/tablayout_origin.gif)

Browse the override TabLayout

![](https://raw.githubusercontent.com/296777513/Picture/master/TabLayout/tablayout_after.gif)

# Usage



in layout's xml

```xml
<com.knight.tablayout.TabLayout
            android:id="@+id/tablayout"
            android:layout_width="match_parent"
            android:layout_height="70dp"
            app:tabIndicatorAnimation="true"
            app:tabIndicatorFullWidth="false"
            app:tabIndicatorWidthPercent="0.2"
            app:tabViewHalfVisible="true"
            app:tabMode="scrollable"/>
```

in kotlin's code

```kotlin
        tablayout.isIndicatorAnimation = true
        tablayout.setTabIndicatorFullWidth(false)
        tablayout.mIsHalfVisible = true
```


# Improve

If you have some problem or advice, please don't hesitate to raise an issue. Just have fun and hope this can help you.

# License

> Apache Version 2.0
>
> Copyright 2018 Knight
>
> Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
>
> http://www.apache.org/licenses/LICENSE-2.0
>
> Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License