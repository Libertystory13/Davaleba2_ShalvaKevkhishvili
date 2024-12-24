import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.davaleba2_shalvakevkhishvili.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class FuelLogFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var fabAddFuelUp: FloatingActionButton

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_fuel_log, container, false)

        recyclerView = view.findViewById(R.id.fuel_log_recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(requireContext())

        fabAddFuelUp = view.findViewById(R.id.fab_add_fuel_up)
        fabAddFuelUp.setOnClickListener {
        }

        val adapter = FuelLogAdapter(listOf(
            FuelLogEntry(1, 1000, 50.0, 15.0),
            FuelLogEntry(2, 1200, 55.0, 16.0)
        ))
        recyclerView.adapter = adapter

        return view
    }
}