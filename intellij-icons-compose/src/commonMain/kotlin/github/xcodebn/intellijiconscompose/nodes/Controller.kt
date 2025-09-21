package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Controller: ImageVector
    get() {
        if (_Controller != null) return _Controller!!

        _Controller = ImageVector.Builder(
            name = "Controller",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(15f, 8f)
                curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(12f, 6f)
                lineTo(10f, 7f)
                lineTo(9f, 6f)
                lineTo(10f, 4f)
                curveTo(10.13f, 4.07f, 9.82f, 4.00f, 9.50f, 4.00f)
                curveTo(8.12f, 4.00f, 7.00f, 5.12f, 7.00f, 6.50f)
                curveTo(7.00f, 6.82f, 7.07f, 7.13f, 7.18f, 7.41f)
                lineTo(4f, 10f)
                lineTo(6f, 12f)
                lineTo(9f, 9f)
                curveTo(8.87f, 8.93f, 9.18f, 9.00f, 9.50f, 9.00f)
                curveTo(10.88f, 9.00f, 12.00f, 7.88f, 12.00f, 6.50f)
                curveTo(12.00f, 6.18f, 11.93f, 5.87f, 11.82f, 5.59f)
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF40B6E0))
                ) {
                    moveTo(15f, 8f)
                    curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                    curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                    curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                    curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                }
                path(
                    fill = SolidColor(Color(0xFF231F20))
                ) {
                    moveTo(12f, 6f)
                    lineTo(10f, 7f)
                    lineTo(9f, 6f)
                    lineTo(10f, 4f)
                    curveTo(10.13f, 4.07f, 9.82f, 4.00f, 9.50f, 4.00f)
                    curveTo(8.12f, 4.00f, 7.00f, 5.12f, 7.00f, 6.50f)
                    curveTo(7.00f, 6.82f, 7.07f, 7.13f, 7.18f, 7.41f)
                    lineTo(4f, 10f)
                    lineTo(6f, 12f)
                    lineTo(9f, 9f)
                    curveTo(8.87f, 8.93f, 9.18f, 9.00f, 9.50f, 9.00f)
                    curveTo(10.88f, 9.00f, 12.00f, 7.88f, 12.00f, 6.50f)
                    curveTo(12.00f, 6.18f, 11.93f, 5.87f, 11.82f, 5.59f)
                }
            }
        }.build()

        return _Controller!!
    }

private var _Controller: ImageVector? = null

