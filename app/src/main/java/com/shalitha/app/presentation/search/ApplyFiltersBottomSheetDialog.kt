package com.shalitha.app.presentation.search

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.shalitha.app.databinding.BottomSheetDialogApplyFilterBinding

/**
 *  @Author Shalitha Samarasinghe
 *  @Create  2022-04-17 .
 */
class ApplyFiltersBottomSheetDialog : BottomSheetDialogFragment() {
    private lateinit var mBinding: BottomSheetDialogApplyFilterBinding

    companion object {
        const val TAG = "ApplyFiltersBottomSheetDialog"
    }


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        mBinding = BottomSheetDialogApplyFilterBinding.inflate(inflater, container, false)
        return mBinding.root
    }

}