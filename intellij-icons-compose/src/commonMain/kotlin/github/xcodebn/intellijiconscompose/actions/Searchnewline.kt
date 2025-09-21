package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Searchnewline: ImageVector
    get() {
        if (_Searchnewline != null) return _Searchnewline!!

        _Searchnewline = ImageVector.Builder(
            name = "Searchnewline",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF7F8B91))
            ) {
                moveTo(9f, 3f)
                curveTo(12.50f, 3.00f, 14.00f, 4.50f, 14.00f, 7.00f)
                curveTo(14.00f, 9.50f, 12.50f, 11.00f, 9.00f, 11.00f)
                lineTo(9f, 10f)
                curveTo(10.50f, 10.00f, 13.00f, 9.50f, 13.00f, 7.00f)
                curveTo(13.00f, 4.50f, 10.50f, 4.00f, 9.00f, 4.00f)
                lineTo(9f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF7F8B91))
            ) {
                moveTo(8f, 7f)
                lineTo(8f, 14f)
                lineTo(4f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF7F8B91))
                ) {
                    moveTo(9f, 3f)
                    curveTo(12.50f, 3.00f, 14.00f, 4.50f, 14.00f, 7.00f)
                    curveTo(14.00f, 9.50f, 12.50f, 11.00f, 9.00f, 11.00f)
                    lineTo(9f, 10f)
                    curveTo(10.50f, 10.00f, 13.00f, 9.50f, 13.00f, 7.00f)
                    curveTo(13.00f, 4.50f, 10.50f, 4.00f, 9.00f, 4.00f)
                    lineTo(9f, 3f)
                    close()
                }
            }
        }.build()

        return _Searchnewline!!
    }

private var _Searchnewline: ImageVector? = null

