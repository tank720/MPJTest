package com.rwang.mpj.demo;

import mpi.*;

public class Main {

    public static void main(String args[]){

        MPI.Init(args);

        int me = MPI.COMM_WORLD.Rank();
        int size = MPI.COMM_WORLD.Size();

        System.out.println("Hi from <"+me+"> of " + size );
        MPI.Finalize();
    }
}