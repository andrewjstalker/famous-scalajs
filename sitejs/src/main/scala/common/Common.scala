package common

import admin._

import scalatags.JsDom.all._
import scalatags.JsDom.tags2.main

object Common {

  // Define common tags
  val v: HtmlTag = a(href:="javascript:void(0)")
  def row(rowCls: String = ""): HtmlTag = div(cls:=s"row $rowCls")
  def column(columnCls: String = ""): HtmlTag = div(cls:=s"column $columnCls")
  val page: HtmlTag = main(id:="content", role:="main")

  val hiddenSubmit: HtmlTag = input(`type`:="submit",value:="",style:="display:none")

  // temp
  val userImg: String = "http://placehold.it/500&text=USER"

  def dropdownMenu(menuId: String)(toggle: HtmlTag)(items: Seq[HtmlTag]): Seq[HtmlTag] = Seq(
    toggle("data-dropdown".attr:=menuId, "aria-controls".attr:=menuId, "aria-expanded".attr:="false"),
    ul(id:=menuId, cls:="f-dropdown", "data-dropdown-content".attr:="", "aria-hidden".attr:="true", tabindex:="-1")(items)
  )
}
