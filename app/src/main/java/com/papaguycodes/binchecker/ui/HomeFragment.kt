package com.papaguycodes.binchecker.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.papaguycodes.binchecker.R
import com.papaguycodes.binchecker.viewmodel.BinViewModel

class HomeFragment : Fragment() {

    private val binViewModel: BinViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        // TODO: Bind UI components with ViewModel and set up listeners
    }
}
