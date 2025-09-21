package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Quickfixbulb: ImageVector
    get() {
        if (_Quickfixbulb != null) return _Quickfixbulb!!

        _Quickfixbulb = ImageVector.Builder(
            name = "Quickfixbulb",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(6f, 14f)
                lineTo(10f, 14f)
                lineTo(10f, 14f)
                curveTo(10.50f, 14.55f, 10.05f, 15.00f, 9.50f, 15.00f)
                lineTo(6f, 15f)
                curveTo(5.95f, 15.00f, 5.50f, 14.55f, 5.50f, 14.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFDB5860))
            ) {
                moveTo(13f, 5f)
                curveTo(13.00f, 9.20f, 11.00f, 8.97f, 11.00f, 11.00f)
                lineTo(5f, 11f)
                curveTo(5.00f, 9.03f, 3.00f, 9.20f, 3.00f, 5.20f)
                curveTo(3.00f, 2.99f, 5.24f, 1.00f, 8.00f, 1.00f)
                curveTo(10.76f, 1.00f, 13.00f, 2.99f, 13.00f, 5.20f)
                close()
                moveTo(7f, 3f)
                lineTo(7f, 7f)
                lineTo(9f, 7f)
                lineTo(9f, 3f)
                lineTo(7f, 3f)
                close()
                moveTo(7f, 8f)
                lineTo(7f, 10f)
                lineTo(9f, 10f)
                lineTo(9f, 8f)
                lineTo(7f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(6f, 14f)
                    lineTo(10f, 14f)
                    lineTo(10f, 14f)
                    curveTo(10.50f, 14.55f, 10.05f, 15.00f, 9.50f, 15.00f)
                    lineTo(6f, 15f)
                    curveTo(5.95f, 15.00f, 5.50f, 14.55f, 5.50f, 14.00f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFDB5860))
                ) {
                    moveTo(13f, 5f)
                    curveTo(13.00f, 9.20f, 11.00f, 8.97f, 11.00f, 11.00f)
                    lineTo(5f, 11f)
                    curveTo(5.00f, 9.03f, 3.00f, 9.20f, 3.00f, 5.20f)
                    curveTo(3.00f, 2.99f, 5.24f, 1.00f, 8.00f, 1.00f)
                    curveTo(10.76f, 1.00f, 13.00f, 2.99f, 13.00f, 5.20f)
                    close()
                    moveTo(7f, 3f)
                    lineTo(7f, 7f)
                    lineTo(9f, 7f)
                    lineTo(9f, 3f)
                    lineTo(7f, 3f)
                    close()
                    moveTo(7f, 8f)
                    lineTo(7f, 10f)
                    lineTo(9f, 10f)
                    lineTo(9f, 8f)
                    lineTo(7f, 8f)
                    close()
                }
            }
        }.build()

        return _Quickfixbulb!!
    }

private var _Quickfixbulb: ImageVector? = null

