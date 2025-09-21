package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Popframe: ImageVector
    get() {
        if (_Popframe != null) return _Popframe!!

        _Popframe = ImageVector.Builder(
            name = "Popframe",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 5f)
                lineTo(14f, 5f)
                lineTo(14f, 14f)
                lineTo(5f, 14f)
                lineTo(5f, 9f)
                lineTo(7f, 11f)
                lineTo(7f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 7f)
                lineTo(11f, 7f)
                lineTo(9f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(9f, 5f)
                    lineTo(14f, 5f)
                    lineTo(14f, 14f)
                    lineTo(5f, 14f)
                    lineTo(5f, 9f)
                    lineTo(7f, 11f)
                    lineTo(7f, 12f)
                    lineTo(12f, 12f)
                    lineTo(12f, 7f)
                    lineTo(11f, 7f)
                    lineTo(9f, 5f)
                    close()
                }
            }
        }.build()

        return _Popframe!!
    }

private var _Popframe: ImageVector? = null

