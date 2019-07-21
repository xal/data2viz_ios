package io.data2viz.viz

//import android.graphics.*
import io.data2viz.color.Color
import io.data2viz.color.ColorOrGradient
import io.data2viz.color.Gradient
import kotlinx.cinterop.cValuesOf
import platform.CoreGraphics.*
import platform.UIKit.UIGraphicsGetCurrentContext

fun ColorOrGradient.oneColor(): Color {

    return when (this) {
        is Color -> this
        is Gradient -> colorStops[0].color
        else -> error("invalid value")
    }
}

fun Color.toCValues() = cValuesOf(this.alpha.value, r / 256.0, g / 256.0, b / 256.0)


fun RectNode.render(renderer: IOSCanvasRenderer) {

//    var context = renderer.uiContext
    var context = UIGraphicsGetCurrentContext()

    val rgb = CGColorSpaceCreateDeviceRGB()

    //    val values = cValuesOf (0.0, 1.0, 0.0, 1.0)


    with(renderer) {
        fill?.let {

            val color = CGColorCreate(rgb, it.oneColor().toCValues())

            CGContextSetFillColorWithColor(context, color)

            val rect = CGRectMake(left, top, (right - left), (bottom - top))

            CGContextFillRect(context, rect)
        }
        stroke?.let {

            val color = CGColorCreate(rgb, it.oneColor().toCValues())

            CGContextSetStrokeColorWithColor(context, color)

            val rect = CGRectMake(left, top, (right - left), (bottom - top))

            CGContextStrokeRect(context, rect)
        }
    }


//
//	val canvas = renderer.canvas
//	with(renderer) {
//		fill?.let {
//			paint.style = Paint.Style.FILL
//			it.updatePaint(paint, renderer)
//			canvas.drawRect(
//				x.dp,
//				y.dp,
//				(x + width).dp,
//				(y + height).dp,
//				paint)
//		}
//		stroke?.let {
//			paint.style = Paint.Style.STROKE
//			it.updatePaint(paint, renderer)
//			canvas.drawRect(
//				x.dp,
//				y.dp,
//				(x + width).dp,
//				(y + height).dp,
//				paint)
//		}
//	}

}
