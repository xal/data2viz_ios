package io.data2viz.viz

import io.data2viz.timer.Timer
import io.data2viz.viz.Viz
import io.data2viz.viz.VizRenderer
import io.data2viz.viz.render
import io.data2viz.color.Color
import io.data2viz.color.ColorOrGradient
import io.data2viz.color.Gradient
import kotlinx.cinterop.cValuesOf
import platform.CoreGraphics.*
import platform.UIKit.UIGraphicsGetCurrentContext

class IOSCanvasRenderer (override val viz: Viz) : VizRenderer {

//    lateinit var uiContext: CGContextRef
    private val animationTimers = mutableListOf<Timer>()


    init {
        viz.renderer = this
    }

    override fun render() {
        viz.layers.forEach { layer ->
            if (layer.visible)
                layer.render(this)
        }

    }

    override fun startAnimations() {
//        if (viz.animationTimers.isNotEmpty()) {
//            viz.animationTimers.forEach { anim ->
//                animationTimers += timer { time ->
//                    anim(time)
//                }
//            }
//            animationTimers += timer {
//                render()
//            }
//        }
    }

    override fun stopAnimations() {
//        animationTimers.forEach { it.stop() }
    }


}