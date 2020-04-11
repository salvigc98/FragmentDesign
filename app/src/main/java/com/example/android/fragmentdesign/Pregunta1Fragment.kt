package com.example.android.fragmentdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_pregunta1.*

/**
 * A simple [Fragment] subclass.
 */
class Pregunta1Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pregunta1, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fun nextFragment() {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.mainContainer, Pregunta2Fragment()).commit()
        }

        btnPregunta2A.setOnClickListener {
            nextFragment()
        }

        btnPregunta2B.setOnClickListener {
            nextFragment()
        }
    }

}
