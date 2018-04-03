package nz.ac.auckland.cs

import java.io.BufferedReader
import java.io.FileReader
import java.util.stream.Stream

fun main(args: Array<String>) {
    if (args.size != 1) System.exit(1)
    val bufferedReader = BufferedReader(FileReader(args[0]))
    val text: Stream<String?> = bufferedReader.lines()
    text.filter{x -> x != null}.forEach {
        // do stuff
    }
}