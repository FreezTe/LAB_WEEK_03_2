package com.example.lab_week_03

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.findNavController

class ListFragment : Fragment() {
    // onCreateView and onCreate can remain the same

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val coffeeList = listOf<View>(
            view.findViewById(R.id.affogato),
            view.findViewById(R.id.americano),
            view.findViewById(R.id.latte)
        )

        coffeeList.forEach { coffeeView -> // Renamed to avoid confusion with the 'coffee' variable if any
            val fragmentBundle = Bundle()
            // It's good practice to use the specific ID of the coffee item
            // if you have distinct data for each. For now, using coffeeView.id
            // which refers to the View's ID.
            fragmentBundle.putInt(COFFEE_ID, coffeeView.id)

            coffeeView.setOnClickListener { clickedView -> // 'clickedView' is the View that was clicked
                clickedView.findNavController().navigate(
                    R.id.coffee_id_action,
                    fragmentBundle
                )
            }
        }
    }

    companion object {
        const val COFFEE_ID = "COFFEE_ID"
    }
}
