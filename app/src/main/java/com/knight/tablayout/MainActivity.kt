package com.knight.tablayout

import android.content.Context
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v4.view.PagerAdapter
import android.support.v4.view.ViewPager
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {


    private val strs = arrayOf("推荐", "关注", "游戏", "野外", "萌宠", "真人", "唱歌", "打仗", "搞笑", "婚恋")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewpager.adapter = object : PagerAdapter() {
            override fun getCount(): Int {
                return 8
            }

            override fun isViewFromObject(view: View, `object`: Any): Boolean {
                return view === `object`
            }

            override fun instantiateItem(container: ViewGroup, position: Int): Any {
                val textView = TextView(this@MainActivity)
                textView.text = position.toString() + ""
                textView.textSize = 50f
                container.addView(textView)
                return textView
            }

            override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
                container.removeView(`object` as View)
            }

            override fun getPageTitle(position: Int): CharSequence? {
                return strs[position]
            }
        }
        val wm1 = this.windowManager
        val screenWidth = wm1.defaultDisplay.width
        val width = (screenWidth / 4.5f).toInt()
        tablayout.setTabItemWidth(width)
        tablayout.setupWithViewPager(viewpager)
        tablayout.isIndicatorAnimation = true
//        tablayout.setTabIndicatorFullWidth(false)
//        tablayout.selectedTabIndicatorWidth = 10

    }

    fun dip2px(context: Context, dpValue: Float): Int {
        val scale = context.resources.displayMetrics.density
        return (dpValue * scale + 0.5f).toInt()
    }
}
