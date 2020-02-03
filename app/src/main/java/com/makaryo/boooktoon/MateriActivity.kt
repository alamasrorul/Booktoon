package com.makaryo.boooktoon

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.viewpager.widget.ViewPager
import com.viewpagerindicator.CirclePageIndicator
import kotlinx.android.synthetic.main.activity_materi.*
import kotlin.collections.ArrayList


class MateriActivity : AppCompatActivity() {
    internal var TAG = MainActivity::class.java.simpleName

    lateinit var viewPager: ViewPager
    lateinit var context: Context
    lateinit var sliderItems: MutableList<MateriModel>



//    private val myImageList =
//        listOf(R.drawable.slide4, R.drawable.slide5, R.drawable.slide6, R.drawable.slide7)
//    private val myImageList1 = listOf(
//        R.drawable.slide8,
//        R.drawable.slide9,
//        R.drawable.slide10,
//        R.drawable.slide11,
//        R.drawable.slide12,
//        R.drawable.slide13,
//        R.drawable.slide14
//    )
//    private val myImageList2 = listOf(R.drawable.slide15, R.drawable.slide16, R.drawable.slide17)
//    private val myImageList3 = listOf(
//        R.drawable.slide18,
//        R.drawable.slide19,
//        R.drawable.slide20,
//        R.drawable.slide21,
//        R.drawable.slide22
//    )
//    private val myImageList4 = listOf(
//        R.drawable.slide23,
//        R.drawable.slide24,
//        R.drawable.slide25,
//        R.drawable.slide26,
//        R.drawable.slide27,
//        R.drawable.slide28,
//        R.drawable.slide29
//    )
//    private val myImageList5 = listOf(
//        R.drawable.slide30,
//        R.drawable.slide31,
//        R.drawable.slide32,
//        R.drawable.slide33,
//        R.drawable.slide34,
//        R.drawable.slide35,
//        R.drawable.slide36
//    )
//    private val myImageList6 =
//        listOf(R.drawable.slide37, R.drawable.slide38, R.drawable.slide39, R.drawable.slide40)
//    private val myImageList7 = listOf(R.drawable.slide41, R.drawable.slide42, R.drawable.slide43)

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materi)

//        try {
            context = this
            viewPager = findViewById(R.id.pager)
        val data = intent.getStringExtra("data")
        println("data : " + data)

        if(data == "1")  {
                    sliderItems = ArrayList()
                    sliderItems.add(MateriModel(1, R.drawable.slide4))
                    sliderItems.add(MateriModel(2, R.drawable.slide5))
                    sliderItems.add(MateriModel(3, R.drawable.slide6))
                    sliderItems.add(MateriModel(4, R.drawable.slide7))
                    val adapter = SlideImageAdapter(context, sliderItems as ArrayList<MateriModel>)
                viewPager.adapter = adapter
//
               }
   if(data == "2") {
                    sliderItems = ArrayList()
                    sliderItems.add(MateriModel(5, R.drawable.slide8))
                    sliderItems.add(MateriModel(6, R.drawable.slide9))
                    sliderItems.add(MateriModel(7, R.drawable.slide10))
                    sliderItems.add(MateriModel(8, R.drawable.slide11))
                    sliderItems.add(MateriModel(9, R.drawable.slide12))
                    sliderItems.add(MateriModel(10, R.drawable.slide13))
                    sliderItems.add(MateriModel(11, R.drawable.slide14))
                    val adapter = SlideImageAdapter(context, sliderItems as ArrayList<MateriModel>)
                   viewPager.adapter = adapter
}
//
            if(data == "3") {
//else {
//                    sliderItems = ArrayList()
                sliderItems.add(MateriModel(12, R.drawable.slide15))
                sliderItems.add(MateriModel(13, R.drawable.slide16))
                sliderItems.add(MateriModel(14, R.drawable.slide17))

                    val adapter = SlideImageAdapter(context, sliderItems as ArrayList<MateriModel>)
                 viewPager.adapter = adapter
                }
            if(data == "4") {
//                    sliderItems = ArrayList()
                sliderItems.add(MateriModel(15, R.drawable.slide18))
                sliderItems.add(MateriModel(16, R.drawable.slide19))
                sliderItems.add(MateriModel(17, R.drawable.slide20))
                sliderItems.add(MateriModel(18, R.drawable.slide21))
                sliderItems.add(MateriModel(19, R.drawable.slide22))

//                    val adapter = SlideImageAdapter(context, sliderItems as ArrayList<MateriModel>)
//                    viewPager.adapter = adapter
}
            if(data == "5") {
//                    sliderItems = ArrayList()
                sliderItems.add(MateriModel(20, R.drawable.slide23))
                sliderItems.add(MateriModel(21, R.drawable.slide24))
                sliderItems.add(MateriModel(22, R.drawable.slide25))
                sliderItems.add(MateriModel(23, R.drawable.slide26))
                sliderItems.add(MateriModel(24, R.drawable.slide27))
                sliderItems.add(MateriModel(25, R.drawable.slide28))
                sliderItems.add(MateriModel(26, R.drawable.slide29))
                  val adapter = SlideImageAdapter(context, sliderItems as ArrayList<MateriModel>)
                    viewPager.adapter = adapter
}
            if(data == "6"){
//                    sliderItems = ArrayList()
                sliderItems.add(MateriModel(27, R.drawable.slide31))
                sliderItems.add(MateriModel(28, R.drawable.slide32))
                sliderItems.add(MateriModel(29, R.drawable.slide33))
                sliderItems.add(MateriModel(30, R.drawable.slide34))
                sliderItems.add(MateriModel(31, R.drawable.slide35))
                sliderItems.add(MateriModel(32, R.drawable.slide36))

                    val adapter = SlideImageAdapter(context, sliderItems as ArrayList<MateriModel>)
                    viewPager.adapter = adapter
}
        if(data == "7") {
//                    sliderItems = ArrayList()
                sliderItems.add(MateriModel(33, R.drawable.slide37))
                sliderItems.add(MateriModel(34, R.drawable.slide38))
                sliderItems.add(MateriModel(35, R.drawable.slide39))
                sliderItems.add(MateriModel(36, R.drawable.slide40))

 val adapter = SlideImageAdapter(context, sliderItems as ArrayList<MateriModel>)
viewPager.adapter = adapter
    }
            if(data == "8") {
//                    sliderItems = ArrayList()
                sliderItems.add(MateriModel(37, R.drawable.slide41))
                sliderItems.add(MateriModel(38, R.drawable.slide42))
                sliderItems.add(MateriModel(39, R.drawable.slide43))
                val adapter = SlideImageAdapter(context, sliderItems as ArrayList<MateriModel>)
                viewPager.adapter = adapter

            }
//        if (data=="1"){
//                    val adapter = SlideImageAdapter(context, (sliderItems[1] to sliderItems[4]) as ArrayList<MateriModel>)
//                    viewPager.adapter = adapter
//            }
//        else{
//            val adapter = SlideImageAdapter(context, sliderItems as ArrayList<MateriModel>)
//                    viewPager.adapter = adapter
//
//        }
//                }


            //
            //                indicator.setViewPager(mPager)
            //
            //                val density = resources.displayMetrics.density
            //
            //                //Set circle indicator radius
            //                indicator.radius = 5 * density
            //
            //                NUM_PAGES = imageModelArrayList!!.size
            //
            //                indicator.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
            //
            //                    override fun onPageSelected(position: Int) {
            //                        currentPage = position
            //
            //                    }
            //
            //                    override fun onPageScrolled(pos: Int, arg1: Float, arg2: Int) {
            //
            //                    }
            //
            //                    override fun onPageScrollStateChanged(pos: Int) {
            //
            //                    }
            //                })

//
//                indicator.setViewPager(mPager)
//
//                val density = resources.displayMetrics.density
//
//                //Set circle indicator radius
//                indicator.radius = 5 * density
//
//                NUM_PAGES = imageModelArrayList!!.size
//
//                indicator.setOnPageChangeListener(object : ViewPager.OnPageChangeListener {
//
//                    override fun onPageSelected(position: Int) {
//                        currentPage = position
//
//                    }
//
//                    override fun onPageScrolled(pos: Int, arg1: Float, arg2: Int) {
//
//                    }
//
//                    override fun onPageScrollStateChanged(pos: Int) {
//
//                    }
//                })

//        }catch(ex: Exception) {
//                Log.e(TAG, ex.message)
//            }
//        }
    }
}






//
//    companion object {
//
//        private var mPager: ViewPager? = null
//        private var currentPage = 0
//        private var NUM_PAGES = 0
//    }



