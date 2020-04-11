package com.example.android.fragmentdesign

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_pregunta2.*

/**
 * A simple [Fragment] subclass.
 */
class Pregunta2Fragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_pregunta2, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        fun nextView() {
            activity!!.supportFragmentManager.beginTransaction().replace(R.id.mainContainer, PlanEntrenamientoFragment()).commit()
        }

        btnPlanA.setOnClickListener {
            nextView()
        }

        btnPlanB.setOnClickListener {
            nextView()
        }

        btnPlanC.setOnClickListener {
            nextView()
        }
    }

}
