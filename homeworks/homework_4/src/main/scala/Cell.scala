trait Cell

class EmptyCell() extends Cell{
  override def toString():String = "empty"
}

class NumberCell(number: Int) extends Cell{
  override def toString: String = number.toString
}

class StringCell(string:String) extends Cell{
  override def toString(): String = string
}

class ReferenceCell(ix: Int, iy: Int, table: Table) extends Cell {
  override def toString(): String = {
  if (ix < 0 || ix > table.ixs || iy < 0 || iy > table.iys) "outOfRange"
    else {
      val nextCell = getNextCell
      nextCell match {
        case Some(cell: ReferenceCell) => if (cell.getNextCell.get == this) "cyclic" else cell.getNextCell.get.toString
        case Some(cell: Cell) => cell.toString
      }
    }
  }
  def getNextCell: Option[Cell] = table.getCell(ix, iy)
}