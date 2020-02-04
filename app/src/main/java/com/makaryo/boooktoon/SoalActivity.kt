package com.makaryo.boooktoon

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.R.*
import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.AnimatorSet
import android.animation.ObjectAnimator
import android.graphics.Point
import android.graphics.Rect
import android.graphics.RectF
import com.google.android.material.bottomsheet.BottomSheetBehavior
import android.text.Html
import java.nio.file.Files.size
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.*
import android.view.animation.DecelerateInterpolator
import android.widget.*
import androidx.appcompat.app.AlertDialog
import androidx.fragment.app.FragmentActivity
import kotlinx.android.synthetic.main.score.*
import kotlinx.android.synthetic.main.soal_activity.*
import kotlinx.android.synthetic.main.soal_fragment.*
import kotlinx.android.synthetic.main.soal_fragment2.*


class SoalActivity : AppCompatActivity() {

    private var currNo: Int = 0
    private var score: Int = 0
//
//    private var vfParent: ViewFlipper? = null
//    private var bsbPembahasan: BottomSheetBehavior<*>? = null
//    private var sc1 :ScrollView? = null
//    private var sc2 :ScrollView? = null
//    private var llTitlePembahasan: LinearLayout? = null
//    private var tvJwbn: TextView? = null
//    private var tvPembahasan:TextView? = null
//    private var tvChild1No:TextView? = null
//    private var tvChild1Soal:TextView? = null
//    private var tvChild2No: TextView? = null
//    private var tvChild2Soal:TextView? = null
//    private var ivJwbn: ImageView? = null
//    private var ivPembahasan:ImageView? = null
//    private var ivChild1Soal:ImageView? = null
//    private var ivChild2Soal:ImageView? = null
//    private var btNext: Button? = null
//    private var btChild1A:Button? = null
//    private var btChild1B:Button? = null
//    private var btChild1C:Button? = null
//    private var btChild1D:Button? = null
//    private var btChild1E:Button? = null
//    private var btChild2A:Button? = null
//    private var btChild2B:Button? = null
//    private var btChild2C:Button? = null
//    private var btChild2D:Button? = null
//    private var btChild2E:Button? = null

    private var listEval: ArrayList<Evaluasi>? = null

    private var mScaleGestureDetector: ScaleGestureDetector? = null
    private var mScaleFactor = 1.0f
    private var imageView: ImageView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.soal_activity)

        prepareData()
//        prepareView()
//        prepareEvent()

        btnnext!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                if (currNo + 1 >= listEval!!.size) {
                    showResult()
                    return
                }
                if (currNo % 2 == 0) {
                    sc1!!.fullScroll(ScrollView.FOCUS_UP)
                } else {
                    sc2!!.fullScroll(ScrollView.FOCUS_UP)
                }
                prepareQuest(listEval!![++currNo])

                container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
                container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
                container!!.showNext()
            }
        })

        btnA!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {

                val curr = listEval!![currNo]
                curr.pilihan = "A"
                btnA.setBackgroundDrawable(resources.getDrawable(R.drawable.button_click))
                prepareAnswer(true, false, curr)

                if (currNo + 1 >= listEval!!.size) {
                    showResult()
                    return
                }
                if (currNo % 2 == 0) {
                    sc1!!.fullScroll(ScrollView.FOCUS_UP)
                } else {
                    sc2!!.fullScroll(ScrollView.FOCUS_UP)
                }
                prepareQuest(listEval!![++currNo])

                container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
                container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
                container!!.showNext()

            }
        })
        btnB!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val curr = listEval!![currNo]
                curr.pilihan = "B"
                btnB.setBackgroundDrawable(resources.getDrawable(R.drawable.button_click))
                prepareAnswer(true, false, curr)
                if (currNo + 1 >= listEval!!.size) {
                    showResult()
                    return
                }
                if (currNo % 2 == 0) {
                    sc1!!.fullScroll(ScrollView.FOCUS_UP)
                } else {
                    sc2!!.fullScroll(ScrollView.FOCUS_UP)
                }
                prepareQuest(listEval!![++currNo])

                container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
                container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
                container!!.showNext()

            }
        })
        btnC!!.setOnClickListener {
            val curr = listEval!![currNo]
            curr.pilihan = "C"
            btnC.setBackgroundDrawable(resources.getDrawable(R.drawable.button_click))
            prepareAnswer(true, false, curr)
            if (currNo + 1 >= listEval!!.size) {
                showResult()
                return@setOnClickListener
            }
            if (currNo % 2 == 0) {
                sc1!!.fullScroll(ScrollView.FOCUS_UP)
            } else {
                sc2!!.fullScroll(ScrollView.FOCUS_UP)
            }
            prepareQuest(listEval!![++currNo])

            container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
            container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
            container!!.showNext()

        }
        btnD!!.setOnClickListener {
            val curr = listEval!![currNo]
            curr.pilihan = "D"
            btnD.setBackgroundDrawable(resources.getDrawable(R.drawable.button_click))
            prepareAnswer(true, false, curr)
            if (currNo + 1 >= listEval!!.size) {
                showResult()
                return@setOnClickListener
            }
            if (currNo % 2 == 0) {
                sc1!!.fullScroll(ScrollView.FOCUS_UP)
            } else {
                sc2!!.fullScroll(ScrollView.FOCUS_UP)
            }
            prepareQuest(listEval!![++currNo])

            container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
            container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
            container!!.showNext()

        }
        btnE!!.setOnClickListener {
            val curr = listEval!![currNo]
            curr.pilihan = "E"
            btnE.setBackgroundDrawable(resources.getDrawable(R.drawable.button_click))
            prepareAnswer(true, false, curr)
            if (currNo + 1 >= listEval!!.size) {
                showResult()
                return@setOnClickListener
            }
            if (currNo % 2 == 0) {
                sc1!!.fullScroll(ScrollView.FOCUS_UP)
            } else {
                sc2!!.fullScroll(ScrollView.FOCUS_UP)
            }
            prepareQuest(listEval!![++currNo])

            container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
            container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
            container!!.showNext()

        }

        btnA2!!.setOnClickListener {
            val curr = listEval!![currNo]
            curr.pilihan = "A"
            btnA2.setBackgroundDrawable(resources.getDrawable(R.drawable.button_click))
            prepareAnswer(false, false, curr)
            if (currNo + 1 >= listEval!!.size) {
                showResult()
                return@setOnClickListener
            }
            if (currNo % 2 == 0) {
                sc1!!.fullScroll(ScrollView.FOCUS_UP)
            } else {
                sc2!!.fullScroll(ScrollView.FOCUS_UP)
            }
            prepareQuest(listEval!![++currNo])

            container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
            container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
            container!!.showNext()


        }
        btnB2!!.setOnClickListener {
            val curr = listEval!![currNo]
            curr.pilihan = "B"
            btnB2.setBackgroundDrawable(resources.getDrawable(R.drawable.button_click))
            prepareAnswer(false, false, curr)
            if (currNo + 1 >= listEval!!.size) {
                showResult()
                return@setOnClickListener
            }
            if (currNo % 2 == 0) {
                sc1!!.fullScroll(ScrollView.FOCUS_UP)
            } else {
                sc2!!.fullScroll(ScrollView.FOCUS_UP)
            }
            prepareQuest(listEval!![++currNo])

            container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
            container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
            container!!.showNext()

        }
        btnC2!!.setOnClickListener {
            val curr = listEval!![currNo]
            curr.pilihan = "C"
            btnC2.setBackgroundDrawable(resources.getDrawable(R.drawable.button_click))
            prepareAnswer(false, false, curr)
            if (currNo + 1 >= listEval!!.size) {
                showResult()
                return@setOnClickListener
            }
            if (currNo % 2 == 0) {
                sc1!!.fullScroll(ScrollView.FOCUS_UP)
            } else {
                sc2!!.fullScroll(ScrollView.FOCUS_UP)
            }
            prepareQuest(listEval!![++currNo])

            container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
            container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
            container!!.showNext()

        }
        btnD2!!.setOnClickListener {
            val curr = listEval!![currNo]
            curr.pilihan = "D"
            btnD2.setBackgroundDrawable(resources.getDrawable(R.drawable.button_click))
            prepareAnswer(false, false, curr)
            if (currNo + 1 >= listEval!!.size) {
                showResult()
                return@setOnClickListener
            }
            if (currNo % 2 == 0) {
                sc1!!.fullScroll(ScrollView.FOCUS_UP)
            } else {
                sc2!!.fullScroll(ScrollView.FOCUS_UP)
            }
            prepareQuest(listEval!![++currNo])

            container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
            container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
            container!!.showNext()

        }
        btnE2!!.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View) {
                val curr = listEval!![currNo]
                curr.pilihan = "E"
                btnE2.setBackgroundDrawable(resources.getDrawable(R.drawable.button_click))
                prepareAnswer(false, false, curr)
                if (currNo + 1 >= listEval!!.size) {
                    showResult()
                    return
                }
                if (currNo % 2 == 0) {
                    sc1!!.fullScroll(ScrollView.FOCUS_UP)
                } else {
                    sc2!!.fullScroll(ScrollView.FOCUS_UP)
                }
                prepareQuest(listEval!![++currNo])

                container!!.setOutAnimation(this@SoalActivity, R.anim.out_to_left)
                container!!.setInAnimation(this@SoalActivity, R.anim.in_from_right)
                container!!.showNext()

            }
        })
        prepareQuest(listEval!![0])
    }

//    override fun onCreateOptionsMenu(menu: Menu): Boolean {
//        menuInflater.inflate(R.menu.menu_eval, menu)
//        return true
//    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
//            R.id.btnpref -> {
//                if (currNo - 1 > 0) return true
//                if (currNo % 2 == 0)
//                    svChild2!!.fullScroll(ScrollView.FOCUS_UP)
//                else
//                    svChild1!!.fullScroll(ScrollView.FOCUS_UP)

//                prepareQuest(listEval!![--currNo])
//                container!!.setOutAnimation(this, R.anim.out_to_right)
//                container!!.setInAnimation(this, R.anim.in_from_left)
//                container!!.showPrevious()
//                return true
//            }
            R.id.btnnext -> {
                if (currNo + 1 >= listEval!!.size) return true
//                if (currNo % 2 == 0)
//                    svChild2!!.fullScroll(ScrollView.FOCUS_UP)
//                else
//                    svChild1!!.fullScroll(ScrollView.FOCUS_UP)

                prepareQuest(listEval!![++currNo])
                container!!.setOutAnimation(this, R.anim.out_to_left)
                container!!.setInAnimation(this, R.anim.in_from_right)
                container!!.showNext()
                return true
            }
            else -> return super.onOptionsItemSelected(item)
        }
    }

    private fun prepareData() {
        listEval = ArrayList()
        currNo = 0
        score = 0
        val soal = resources.getStringArray(R.array.soal)
//        val pembahasan = resources.getStringArray(R.array.pembahasan)
        val kunci = resources.getStringArray(R.array.kunci)
        val jwbnA = resources.getStringArray(R.array.textA)
        val jwbnB = resources.getStringArray(R.array.textB)
        val jwbnC = resources.getStringArray(R.array.textC)
        val jwbnD = resources.getStringArray(R.array.textD)
        val jwbnE = resources.getStringArray(R.array.textE)
        for (i in soal.indices) {
            val eval = Evaluasi(
                soal[i], jwbnA[i],
                jwbnB[i], jwbnC[i], jwbnD[i], jwbnE[i], kunci[i]
            )
            listEval!!.add(eval)
        }
    }

//    private fun prepareView() {
//        vfParent = findViewById(R.id.eval_vf) as ViewFlipper

//        val bsViewGroup = findViewById(R.id.eval_ll_pembahasan) as LinearLayout
//        llTitlePembahasan = findViewById(R.id.eval_ll_title_pembahasan) as LinearLayout
//        bsbPembahasan = BottomSheetBehavior.from(bsViewGroup)

//        svChild1 = findViewById(R.id.eval_sv_child_1) as ScrollView
//        svChild2 = findViewById(R.id.eval_sv_child_2) as ScrollView

//        tvJwbn = findViewById(R.id.eval_tv_jwbn) as TextView
//        tvPembahasan = findViewById(R.id.eval_tv_pembahasan) as TextView
//        tvChild1No = findViewById<TextView>(R.id.txtNoSoal)
//        tvChild1Soal = findViewById<TextView>(R.id.txtSoal)
//        tvChild2No = findViewById<TextView>(R.id.txtNoSoal2)
//        tvChild2Soal = findViewById<TextView>(R.id.txtSoal2)

//        ivJwbn = findViewById(R.id.eval_iv_jwbn) as ImageView
//        ivPembahasan = findViewById(R.id.eval_iv_pembahasan) as ImageView
//        ivChild1Soal = findViewById<ImageView>(R.id.imagesoal)
//        ivChild2Soal = findViewById<ImageView>(R.id.imagesoal2)
//
//        btNext = findViewById<Button>(R.id.btnnext)
//        btChild1A = findViewById<Button>(R.id.btnA)
//        btChild1B = findViewById<Button>(R.id.btnB)
//        btChild1C = findViewById<Button>(R.id.btnC)
//        btChild1D = findViewById<Button>(R.id.btnD)
//        btChild1E = findViewById<Button>(R.id.btnE)
//        btChild2A = findViewById<Button>(R.id.btnA2)
//        btChild2B = findViewById<Button>(R.id.btnB2)
//        btChild2C = findViewById<Button>(R.id.btnC2)
//        btChild2D = findViewById<Button>(R.id.btnD2)
//        btChild2E = findViewById<Button>(R.id.btnE2)
//    }

    private fun prepareQuest(curr: Evaluasi) {
        //image pertama
        imagesoal2.setOnClickListener(View.OnClickListener {
            imagesoal2.visibility = View.GONE
            frame.visibility = View.GONE
            frame2.visibility = View.GONE
            imagesoal2b.visibility = View.VISIBLE
        })
        imagesoal2b.setOnClickListener(View.OnClickListener {
            imagesoal2b.visibility = View.GONE
            frame.visibility = View.VISIBLE
            frame2.visibility = View.VISIBLE
            imagesoal2.visibility = View.VISIBLE
        })

        imagesoal.setOnClickListener(View.OnClickListener {
            imagesoal.visibility = View.GONE
            frame.visibility = View.GONE
            frame2.visibility = View.GONE
            imagesoalb.visibility = View.VISIBLE
        })
        imagesoalb.setOnClickListener(View.OnClickListener {
            imagesoalb.visibility = View.GONE
            frame.visibility = View.VISIBLE
            frame2.visibility = View.VISIBLE
            imagesoal.visibility = View.VISIBLE
        })

        //image ke 2

        image2soal2.setOnClickListener(View.OnClickListener {
            image2soal2.visibility = View.GONE
            frame.visibility = View.GONE
            frame2.visibility = View.GONE
            image2soal2b2.visibility = View.VISIBLE
        })
        image2soal2b2.setOnClickListener(View.OnClickListener {
            image2soal2b2.visibility = View.GONE
            frame.visibility = View.VISIBLE
            frame2.visibility = View.VISIBLE
            image2soal2.visibility = View.VISIBLE
        })

        image2soal.setOnClickListener(View.OnClickListener {
            image2soal.visibility = View.GONE
            frame.visibility = View.GONE
            frame2.visibility = View.GONE
            image2soalb2.visibility = View.VISIBLE
        })
        image2soalb2.setOnClickListener(View.OnClickListener {
            image2soalb2.visibility = View.GONE
            frame.visibility = View.VISIBLE
            frame2.visibility = View.VISIBLE
            image2soal.visibility = View.VISIBLE
        })



        if (currNo % 2 == 0) {
            // no genap -> child1
            txtNoSoal!!.text = (currNo + 1).toString() + "."
            txtSoal!!.text = curr.soal

            if (currNo == 3) {
                imagesoal!!.setImageResource(R.mipmap.soal_4a)
                image2soal!!.setImageResource(R.mipmap.soal_4b)
                imagesoalb!!.setImageResource(R.mipmap.soal_4a)
                image2soalb2!!.setImageResource(R.mipmap.soal_4b)

            } else if (currNo == 5) {
                imagesoal!!.setImageResource(R.mipmap.soal_6)
                imagesoalb!!.setImageResource(R.mipmap.soal_6)
                image2soal!!.setImageDrawable(null)
            } else if (currNo == 8) {
                imagesoal!!.setImageResource(R.mipmap.soal_9)
                imagesoalb!!.setImageResource(R.mipmap.soal_9)
                image2soal!!.setImageDrawable(null)
            } else if (currNo == 9) {
                imagesoal!!.setImageResource(R.mipmap.soal_10)
                imagesoalb!!.setImageResource(R.mipmap.soal_10)
                image2soal!!.setImageDrawable(null)
            } else if (currNo == 16) {
                imagesoal!!.setImageResource(R.mipmap.soal_17)
                imagesoalb!!.setImageResource(R.mipmap.soal_17)
                image2soal!!.setImageDrawable(null)
            } else if (currNo == 17) {
                imagesoal!!.setImageResource(R.mipmap.soal_18)
                imagesoalb!!.setImageResource(R.mipmap.soal_18)
                image2soal!!.setImageDrawable(null)
            } else if (currNo == 18) {
                imagesoal!!.setImageResource(R.mipmap.soal_19)
                imagesoalb!!.setImageResource(R.mipmap.soal_19)
                image2soal!!.setImageDrawable(null)
            } else if (currNo == 19) {
                imagesoal!!.setImageResource(R.mipmap.soal_20a)
                imagesoalb!!.setImageResource(R.mipmap.soal_20a)
                image2soal!!.setImageResource(R.mipmap.soal_20b)
            } else {
                imagesoal!!.setImageDrawable(null)
                image2soal!!.setImageDrawable(null)
            }
            btnA!!.text = Html.fromHtml(curr.jwbnA)
            btnB!!.text = Html.fromHtml(curr.jwbnB)
            btnC!!.text = Html.fromHtml(curr.jwbnC)
            btnD!!.text = Html.fromHtml(curr.jwbnD)
            btnE!!.text = Html.fromHtml(curr.jwbnE)

            prepareAnswer(true, curr.pilihan == "-", curr)
        } else {
            // no ganjil -> child2
            txtNoSoal2!!.text = (currNo + 1).toString() + "."
            txtSoal2!!.text = curr.soal

            if (currNo == 3) {
                imagesoal2!!.setImageResource(R.mipmap.soal_4a)
                image2soal2!!.setImageResource(R.mipmap.soal_4b)
                imagesoal2b!!.setImageResource(R.mipmap.soal_4a)
                image2soal2b2!!.setImageResource(R.mipmap.soal_4b)

            } else if (currNo == 5) {
                imagesoal2!!.setImageResource(R.mipmap.soal_6)
                imagesoal2b!!.setImageResource(R.mipmap.soal_6)
                image2soal2!!.setImageDrawable(null)
            } else if (currNo == 8) {
                imagesoal2!!.setImageResource(R.mipmap.soal_9)
                imagesoal2b!!.setImageResource(R.mipmap.soal_9)
                image2soal2!!.setImageDrawable(null)
            } else if (currNo == 9) {
                imagesoal2!!.setImageResource(R.mipmap.soal_10)
                imagesoal2b!!.setImageResource(R.mipmap.soal_10)
                image2soal2!!.setImageDrawable(null)
            } else if (currNo == 16) {
                imagesoal2!!.setImageResource(R.mipmap.soal_17)
                imagesoal2b!!.setImageResource(R.mipmap.soal_17)
                image2soal2!!.setImageDrawable(null)
            } else if (currNo == 17) {
                imagesoal2!!.setImageResource(R.mipmap.soal_18)
                imagesoal2b!!.setImageResource(R.mipmap.soal_18)
                image2soal2!!.setImageDrawable(null)
            } else if (currNo == 18) {
                imagesoal2!!.setImageResource(R.mipmap.soal_19)
                imagesoal2b!!.setImageResource(R.mipmap.soal_19)
                image2soal2!!.setImageDrawable(null)
            } else if (currNo == 19) {
                imagesoal2!!.setImageResource(R.mipmap.soal_20a)
                image2soal2!!.setImageResource(R.mipmap.soal_20b)
                imagesoal2b!!.setImageResource(R.mipmap.soal_20a)
                image2soal2b2!!.setImageResource(R.mipmap.soal_20b)
            } else {
                imagesoal2!!.setImageDrawable(null)
                image2soal2!!.setImageDrawable(null)
            }
            btnA2!!.text = Html.fromHtml(curr.jwbnA)
            btnB2!!.text = Html.fromHtml(curr.jwbnB)
            btnC2!!.text = Html.fromHtml(curr.jwbnC)
            btnD2!!.text = Html.fromHtml(curr.jwbnD)
            btnE2!!.text = Html.fromHtml(curr.jwbnE)

            prepareAnswer(false, curr.pilihan == "-", curr)
        }
    }

    private fun prepareAnswer(child: Boolean, answered: Boolean, curr: Evaluasi) {
        if (child) {
            btnA!!.isClickable = answered
            btnB!!.isClickable = answered
            btnC!!.isClickable = answered
            btnD!!.isClickable = answered
            btnE!!.isClickable = answered
        } else {
            btnA2!!.isClickable = answered
            btnB2!!.isClickable = answered
            btnC2!!.isClickable = answered
            btnD2!!.isClickable = answered
            btnE2!!.isClickable = answered

        }

        if (!answered) {
//            ivJwbn!!.setImageResource(curr.pilihanRes)
//            if (currNo == listEval!!.size - 1)
//                btnnext!!.text = "finish"
//            else
//                btnnext!!.text = "next"

            val choice = curr.pilihan
            val key = curr.kunci
            if (choice == key) {
//                llTitlePembahasan!!.setBackgroundResource(R.color.colorWhite)
//                tvJwbn!!.text = "Selamat, jawaban kamu benar :)"
                score++
            }
//            else {
//                llTitlePembahasan!!.setBackgroundResource(R.color.colorAccent)
//                tvJwbn!!.text =
//                    Html.fromHtml("Jawaban kamu salah :(<br/>Jawaban yang benar adalah <b>$key</b>.")
//            }

//            if (currNo == 18)
//                ivPembahasan!!.setImageResource(R.mipmap.person)
//            else if (currNo == 19)
//                ivPembahasan!!.setImageResource(R.mipmap.person)
//            else
//                ivPembahasan!!.setImageDrawable(null)

//            tvPembahasan!!.setText(curr.pembahasan)
        }
//        bsbPembahasan!!.isHideable = answered
//        bsbPembahasan!!.state = if (answered)
//            BottomSheetBehavior.STATE_HIDDEN
//        else
//            BottomSheetBehavior.STATE_COLLAPSED
    }

    private fun showResult() {

        score *= 5

        //val dialogview=LayoutInflater.from(this).inflate(R.layout.score,null)


        val builder = AlertDialog.Builder(this)
        //  .setView(dialogview)
        val layout = LinearLayout(this)
        val text1 = TextView(this)
        //val text2= TextView(this)
        text1.text = "Point yang Anda Dapat : " + score.toString()

        println(score)
        //text2.text=score.toString()
        layout.orientation = LinearLayout.VERTICAL

        layout.addView(text1)
        //layout.addView(text2)
        layout.setPadding(50, 40, 50, 40)
        builder.setView(layout)


        builder.create().show()


        //val malertDialogView= builder.show()


//        dialogview.dialogCancelBtn.setOnclickListener{
//            malertDialogView.dismiss()
//        }

        Toast.makeText(applicationContext, "Score anda $score", Toast.LENGTH_SHORT).show()
        //  finish()

    }


}

