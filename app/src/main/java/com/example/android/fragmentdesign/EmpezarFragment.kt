package com.example.android.fragmentdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_empezar.*

/**
 * A simple [Fragment] subclass.
 */
class EmpezarFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_empezar, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btnPregunta1.setOnClickListener {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.mainContainer, Pregunta1Fragment()).commit()
        }
    }

}
