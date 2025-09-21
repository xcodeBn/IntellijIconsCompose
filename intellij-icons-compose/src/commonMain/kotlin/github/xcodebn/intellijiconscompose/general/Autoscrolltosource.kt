package github.xcodebn.intellijiconscompose.general

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Autoscrolltosource: ImageVector
    get() {
        if (_Autoscrolltosource != null) return _Autoscrolltosource!!

        _Autoscrolltosource = ImageVector.Builder(
            name = "Autoscrolltosource",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(12f, 7f)
                lineTo(12f, 6f)
                lineTo(13f, 6f)
                lineTo(13f, 3f)
                lineTo(3f, 3f)
                lineTo(3f, 6f)
                lineTo(4f, 6f)
                lineTo(4f, 7f)
                lineTo(2f, 7f)
                lineTo(2f, 2f)
                lineTo(14f, 2f)
                lineTo(14f, 7f)
                lineTo(12f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(9f, 11f)
                lineTo(12f, 11f)
                lineTo(8f, 15f)
                lineTo(4f, 11f)
                lineTo(7f, 11f)
                lineTo(7f, 6f)
                lineTo(9f, 6f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(12f, 7f)
                    lineTo(12f, 6f)
                    lineTo(13f, 6f)
                    lineTo(13f, 3f)
                    lineTo(3f, 3f)
                    lineTo(3f, 6f)
                    lineTo(4f, 6f)
                    lineTo(4f, 7f)
                    lineTo(2f, 7f)
                    lineTo(2f, 2f)
                    lineTo(14f, 2f)
                    lineTo(14f, 7f)
                    lineTo(12f, 7f)
                    close()
                }
            }
        }.build()

        return _Autoscrolltosource!!
    }

private var _Autoscrolltosource: ImageVector? = null

