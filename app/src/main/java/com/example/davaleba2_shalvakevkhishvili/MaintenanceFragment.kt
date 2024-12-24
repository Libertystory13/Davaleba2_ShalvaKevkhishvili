import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.davaleba2_shalvakevkhishvili.R

class MaintenanceFragment : Fragment() {

    private lateinit var recyclerView: RecyclerView

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_maintenance, container, false)

        recyclerView = view.findViewById(R.id.maintenance_recycler_view)
        recyclerView.layoutManager = GridLayoutManager(requireContext(), 2)

        val adapter = MaintenanceAdapter(listOf(
            "Oil Change",
            "Tire Rotation",
            "Brake Check",
            "Air Filter",
            "Fluid Check",
            "Battery Check"
        ))
        recyclerView.adapter = adapter

        return view
    }

    private fun MaintenanceAdapter(listOf: List<String>): RecyclerView.Adapter<RecyclerView.ViewHolder>? {
        TODO("Not yet implemented")
    }
}