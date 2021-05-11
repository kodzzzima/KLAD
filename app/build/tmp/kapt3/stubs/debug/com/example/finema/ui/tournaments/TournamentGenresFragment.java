package com.example.finema.ui.tournaments;

import java.lang.System;

@kotlin.Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004B\u0005\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u0012\u001a\u00020\u0013H\u0002J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0002J\u0010\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0013H\u0002J&\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u0018\u0010#\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010%\u001a\u00020\u000eH\u0016J\u001a\u0010&\u001a\u00020\u00132\u0006\u0010$\u001a\u00020\u001c2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082.\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\r0\fX\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0002X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006\'"}, d2 = {"Lcom/example/finema/ui/tournaments/TournamentGenresFragment;", "Lcom/example/finema/ui/base/BaseFragment;", "Lcom/example/finema/ui/tournaments/TournamentGenresVM;", "Lcom/example/finema/databinding/FragmentTournamentGenresBinding;", "Lcom/example/finema/ui/tournaments/TournamentAdapter$TournamentHolder$Listener;", "()V", "allFilms", "Ljava/util/ArrayList;", "Lcom/example/finema/models/movieResponse/Movie;", "mAdapter", "Lcom/example/finema/ui/tournaments/TournamentAdapter;", "mObserverList", "Landroidx/lifecycle/Observer;", "", "Lcom/example/finema/models/databaseModels/GenreModel;", "mRecyclerView", "Landroidx/recyclerview/widget/RecyclerView;", "mViewModel", "dialogBinding", "", "getFilms", "genreID", "", "goNext", "num", "", "initialization", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "savedInstanceState", "Landroid/os/Bundle;", "onMovieClicked", "view", "genreModel", "onViewCreated", "app_debug"})
public final class TournamentGenresFragment extends com.example.finema.ui.base.BaseFragment<com.example.finema.ui.tournaments.TournamentGenresVM, com.example.finema.databinding.FragmentTournamentGenresBinding> implements com.example.finema.ui.tournaments.TournamentAdapter.TournamentHolder.Listener {
    private com.example.finema.ui.tournaments.TournamentGenresVM mViewModel;
    private androidx.recyclerview.widget.RecyclerView mRecyclerView;
    private com.example.finema.ui.tournaments.TournamentAdapter mAdapter;
    private androidx.lifecycle.Observer<java.util.List<com.example.finema.models.databaseModels.GenreModel>> mObserverList;
    private java.util.ArrayList<com.example.finema.models.movieResponse.Movie> allFilms;
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initialization() {
    }
    
    @java.lang.Override()
    public void onMovieClicked(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.NotNull()
    com.example.finema.models.databaseModels.GenreModel genreModel) {
    }
    
    private final void goNext(int num) {
    }
    
    private final void getFilms(java.lang.String genreID) {
    }
    
    private final void dialogBinding() {
    }
    
    public TournamentGenresFragment() {
        super();
    }
}