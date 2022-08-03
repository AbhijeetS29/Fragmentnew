package com.abhijeet.fragmentnew

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView
import androidx.core.content.ContextCompat

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [FirstFragments.newInstance] factory method to
 * create an instance of this fragment.
 */
class FirstFragments : Fragment(), firstInterface {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null
    lateinit var initView: View
    lateinit var tv :TextView
    lateinit var fw:Fragment
    lateinit var llback:LinearLayout
    lateinit var mainActivity: MainActivity

    override fun onAttach(context: Context) {
        super.onAttach(context)
        mainActivity = activity as MainActivity
        mainActivity.firstInterface=this




    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        initView= inflater.inflate(R.layout.fragment_first_fragments, container, false)
        return (initView)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        llback=initView.findViewById(R.id.llback)
        tv=initView.findViewById(R.id.tv)


    }
    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment FirstFragments.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            FirstFragments().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }

    override fun Cream() {
         llback.setBackgroundColor(ContextCompat.getColor(mainActivity,R.color.CReam))
            var i =mainActivity.counter()
            tv.setText("Color changed $i times")

    }

    override fun Red() {
        llback.setBackgroundColor(ContextCompat.getColor(mainActivity,R.color.red))
        var i =mainActivity.counter()
        tv.setText("Color changed $i times")
    }

    override fun Blue() {
        llback.setBackgroundColor(ContextCompat.getColor(mainActivity,R.color.blue))
        var i =mainActivity.counter()
        tv.setText("Color changed $i times")
    }
}