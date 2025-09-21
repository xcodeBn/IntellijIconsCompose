package github.xcodebn.intellijiconscompose.ide

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Updown: ImageVector
    get() {
        if (_Updown != null) return _Updown!!

        _Updown = ImageVector.Builder(
            name = "Updown",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(4f, 6f)
                lineTo(2f, 6f)
                lineTo(4f, 3f)
                lineTo(7f, 6f)
                lineTo(5f, 6f)
                lineTo(5f, 13f)
                lineTo(4f, 13f)
                lineTo(4f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(12f, 10f)
                lineTo(14f, 13f)
                lineTo(9f, 13f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(4f, 6f)
                    lineTo(2f, 6f)
                    lineTo(4f, 3f)
                    lineTo(7f, 6f)
                    lineTo(5f, 6f)
                    lineTo(5f, 13f)
                    lineTo(4f, 13f)
                    lineTo(4f, 6f)
                    close()
                }
            }
        }.build()

        return _Updown!!
    }

private var _Updown: ImageVector? = null

