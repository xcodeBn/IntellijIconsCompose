package github.xcodebn.intellijiconscompose.gutter

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Overridingmethod: ImageVector
    get() {
        if (_Overridingmethod != null) return _Overridingmethod!!

        _Overridingmethod = ImageVector.Builder(
            name = "Overridingmethod",
            defaultWidth = 12.0.dp,
            defaultHeight = 12.0.dp,
            viewportWidth = 12.0f,
            viewportHeight = 12.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFDB5860))
            ) {
                moveTo(10f, 9f)
                lineTo(12f, 9f)
                lineTo(10f, 12f)
                lineTo(7f, 9f)
                lineTo(9f, 9f)
                lineTo(9f, 0f)
                lineTo(10f, 0f)
                lineTo(10f, 9f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(4f, 8f)
                curveTo(2.90f, 8.00f, 2.00f, 7.10f, 2.00f, 6.00f)
                curveTo(2.00f, 4.90f, 2.90f, 4.00f, 4.00f, 4.00f)
                curveTo(5.10f, 4.00f, 6.00f, 4.90f, 6.00f, 6.00f)
                curveTo(6.00f, 7.10f, 5.10f, 8.00f, 4.00f, 8.00f)
                close()
                moveTo(4f, 7f)
                curveTo(4.55f, 7.00f, 5.00f, 6.55f, 5.00f, 6.00f)
                curveTo(5.00f, 5.45f, 4.55f, 5.00f, 4.00f, 5.00f)
                curveTo(3.45f, 5.00f, 3.00f, 5.45f, 3.00f, 6.00f)
                curveTo(3.00f, 6.55f, 3.45f, 7.00f, 4.00f, 7.00f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFDB5860))
                ) {
                    moveTo(10f, 9f)
                    lineTo(12f, 9f)
                    lineTo(10f, 12f)
                    lineTo(7f, 9f)
                    lineTo(9f, 9f)
                    lineTo(9f, 0f)
                    lineTo(10f, 0f)
                    lineTo(10f, 9f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(4f, 8f)
                    curveTo(2.90f, 8.00f, 2.00f, 7.10f, 2.00f, 6.00f)
                    curveTo(2.00f, 4.90f, 2.90f, 4.00f, 4.00f, 4.00f)
                    curveTo(5.10f, 4.00f, 6.00f, 4.90f, 6.00f, 6.00f)
                    curveTo(6.00f, 7.10f, 5.10f, 8.00f, 4.00f, 8.00f)
                    close()
                    moveTo(4f, 7f)
                    curveTo(4.55f, 7.00f, 5.00f, 6.55f, 5.00f, 6.00f)
                    curveTo(5.00f, 5.45f, 4.55f, 5.00f, 4.00f, 5.00f)
                    curveTo(3.45f, 5.00f, 3.00f, 5.45f, 3.00f, 6.00f)
                    curveTo(3.00f, 6.55f, 3.45f, 7.00f, 4.00f, 7.00f)
                    close()
                }
            }
        }.build()

        return _Overridingmethod!!
    }

private var _Overridingmethod: ImageVector? = null

