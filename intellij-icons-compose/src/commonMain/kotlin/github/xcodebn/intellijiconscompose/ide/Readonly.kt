package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Readonly: ImageVector
    get() {
        if (_Readonly != null) return _Readonly!!

        _Readonly = ImageVector.Builder(
            name = "Readonly",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(8f, 4f)
                curveTo(7.17f, 3.50f, 6.50f, 4.12f, 6.50f, 4.89f)
                lineTo(6f, 8f)
                curveTo(6.50f, 8.88f, 7.17f, 9.50f, 8.00f, 9.50f)
                curveTo(8.83f, 9.50f, 9.50f, 8.88f, 9.50f, 8.11f)
                lineTo(10f, 5f)
                curveTo(9.50f, 4.12f, 8.83f, 3.50f, 8.00f, 3.50f)
                close()
                moveTo(8f, 2f)
                curveTo(9.66f, 2.00f, 11.00f, 3.34f, 11.00f, 5.00f)
                lineTo(11f, 8f)
                curveTo(11.00f, 9.66f, 9.66f, 11.00f, 8.00f, 11.00f)
                curveTo(6.34f, 11.00f, 5.00f, 9.66f, 5.00f, 8.00f)
                lineTo(5f, 5f)
                curveTo(5.00f, 3.34f, 6.34f, 2.00f, 8.00f, 2.00f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(8f, 4f)
                    curveTo(7.17f, 3.50f, 6.50f, 4.12f, 6.50f, 4.89f)
                    lineTo(6f, 8f)
                    curveTo(6.50f, 8.88f, 7.17f, 9.50f, 8.00f, 9.50f)
                    curveTo(8.83f, 9.50f, 9.50f, 8.88f, 9.50f, 8.11f)
                    lineTo(10f, 5f)
                    curveTo(9.50f, 4.12f, 8.83f, 3.50f, 8.00f, 3.50f)
                    close()
                    moveTo(8f, 2f)
                    curveTo(9.66f, 2.00f, 11.00f, 3.34f, 11.00f, 5.00f)
                    lineTo(11f, 8f)
                    curveTo(11.00f, 9.66f, 9.66f, 11.00f, 8.00f, 11.00f)
                    curveTo(6.34f, 11.00f, 5.00f, 9.66f, 5.00f, 8.00f)
                    lineTo(5f, 5f)
                    curveTo(5.00f, 3.34f, 6.34f, 2.00f, 8.00f, 2.00f)
                    close()
                }
            }
        }.build()

        return _Readonly!!
    }

private var _Readonly: ImageVector? = null

