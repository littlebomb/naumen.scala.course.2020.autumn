class Table(val ixs:Int, val iys:Int){
  private val table = Array.fill[Cell](ixs * iys)(new EmptyCell)
  def getCell(ix: Int, iy: Int): Option[Cell]={
    if (ix < 0 || ix > ixs || iy < 0 || iy > iys)
      None
    else
      Some(table(ix + iy * ixs))
  }

  def setCell(ix: Int, iy: Int, cell: Cell): Unit ={
    if (ix < 0 || ix > ixs || iy < 0 || iy > iys)
      throw new IndexOutOfBoundsException
    else table(ix + iy * ixs) = cell
  }
}