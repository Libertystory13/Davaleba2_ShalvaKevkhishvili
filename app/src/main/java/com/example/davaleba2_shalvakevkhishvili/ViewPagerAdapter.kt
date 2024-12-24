import android.os.Parcel
import android.os.Parcelable
import androidx.fragment.app.Fragment
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.carcompanion.MainActivity

class ViewPagerAdapter(fragmentManager: MainActivity, lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager, lifecycle) {

    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        return when (position) {
            0 -> HomeFragment()
            1 -> MaintenanceFragment()
            2 -> FuelLogFragment()
            else -> Fragment()
        }
    }

}