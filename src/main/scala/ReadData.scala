/**
  * Created by moscovig on 16/06/2016.
  */
object ReadData  {

 def readCsv(path:String):Seq[Seq[String]] = {
   val bufferedSource = io.Source.fromFile(path)
   val res = (for{
     line <- bufferedSource.getLines
      cols = line.split(",").map(_.trim).toSeq
     // do whatever you want with the columns here
   } yield cols).toSeq

   bufferedSource.close
   res

 }

}

//Assumption1: no ',' in the data
