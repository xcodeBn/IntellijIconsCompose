package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Selectall: ImageVector
    get() {
        if (_Selectall != null) return _Selectall!!

        _Selectall = ImageVector.Builder(
            name = "Selectall",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(12f, 2f)
                lineTo(10f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, 12f)
                lineTo(12f, 12f)
                lineTo(12f, 10f)
                lineTo(14f, 8f)
                lineTo(14f, 14f)
                lineTo(2f, 14f)
                lineTo(2f, 2f)
                lineTo(12f, 2f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(14f, 2f)
                lineTo(16f, 4f)
                lineTo(9f, 11f)
                lineTo(5f, 7f)
                lineTo(6f, 6f)
                lineTo(9f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(12f, 2f)
                    lineTo(10f, 4f)
                    lineTo(4f, 4f)
                    lineTo(4f, 12f)
                    lineTo(12f, 12f)
                    lineTo(12f, 10f)
                    lineTo(14f, 8f)
                    lineTo(14f, 14f)
                    lineTo(2f, 14f)
                    lineTo(2f, 2f)
                    lineTo(12f, 2f)
                    close()
                }
            }
        }.build()

        return _Selectall!!
    }

private var _Selectall: ImageVector? = null

