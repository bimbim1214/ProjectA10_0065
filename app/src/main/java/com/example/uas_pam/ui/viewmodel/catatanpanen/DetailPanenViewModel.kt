package com.example.uas_pam.ui.viewmodel.catatanpanen

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.uas_pam.model.AktivitasPertanian
import com.example.uas_pam.model.CatatanPanen
import com.example.uas_pam.repository.AktivitasPertanianRepository
import com.example.uas_pam.repository.CatatanPanenRepository
import com.example.uas_pam.ui.viewmodel.aktivitas.DetailAktivitasUiState
import com.example.uas_pam.ui.viewmodel.aktivitas.toDetailAktivitasUiEvent
import kotlinx.coroutines.launch


fun CatatanPanen.toDetailPanenUiEvent(): InsertPnnUiEvent {
    return InsertPnnUiEvent(
        id_panen = id_panen,
        id_tanaman = id_tanaman,
        tanggal_panen = tanggal_panen,
        jumlah_panen = jumlah_panen,
        keterangan = keterangan
    )
}