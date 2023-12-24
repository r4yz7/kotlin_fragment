package com.example.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.fragment.databinding.FragmentSettingsBinding
import com.example.fragment.databinding.FragmentUsersListBinding

class UsersListFragment : Fragment() {
    lateinit var  binding: FragmentUsersListBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentUsersListBinding.inflate(layoutInflater, container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.button4.setOnClickListener {
            MAIN.navController.navigate(R.id.action_usersListFragment_to_chatFragment2)
        }
    }
}