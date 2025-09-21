package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Tip: ImageVector
    get() {
        if (_Tip != null) return _Tip!!

        _Tip = ImageVector.Builder(
            name = "Tip",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(5f, 26f)
                lineTo(15f, 26f)
                lineTo(15f, 26f)
                curveTo(15.00f, 27.10f, 14.10f, 28.00f, 13.00f, 28.00f)
                lineTo(7f, 28f)
                curveTo(5.90f, 28.00f, 5.00f, 27.10f, 5.00f, 26.00f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFFEDA200))
            ) {
                moveTo(20f, 8f)
                curveTo(20.00f, 16.40f, 16.00f, 15.94f, 16.00f, 20.00f)
                lineTo(4f, 20f)
                curveTo(4.00f, 16.06f, 0.00f, 16.40f, 0.00f, 8.40f)
                curveTo(0.00f, 3.98f, 4.48f, 0.00f, 10.00f, 0.00f)
                curveTo(15.52f, 0.00f, 20.00f, 3.98f, 20.00f, 8.40f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(5f, 26f)
                    lineTo(15f, 26f)
                    lineTo(15f, 26f)
                    curveTo(15.00f, 27.10f, 14.10f, 28.00f, 13.00f, 28.00f)
                    lineTo(7f, 28f)
                    curveTo(5.90f, 28.00f, 5.00f, 27.10f, 5.00f, 26.00f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFFEDA200))
                ) {
                    moveTo(20f, 8f)
                    curveTo(20.00f, 16.40f, 16.00f, 15.94f, 16.00f, 20.00f)
                    lineTo(4f, 20f)
                    curveTo(4.00f, 16.06f, 0.00f, 16.40f, 0.00f, 8.40f)
                    curveTo(0.00f, 3.98f, 4.48f, 0.00f, 10.00f, 0.00f)
                    curveTo(15.52f, 0.00f, 20.00f, 3.98f, 20.00f, 8.40f)
                    close()
                }
            }
        }.build()

        return _Tip!!
    }

private var _Tip: ImageVector? = null

