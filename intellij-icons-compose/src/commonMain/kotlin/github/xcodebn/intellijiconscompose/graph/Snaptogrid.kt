package github.xcodebn.intellijiconscompose.graph

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Snaptogrid: ImageVector
    get() {
        if (_Snaptogrid != null) return _Snaptogrid!!

        _Snaptogrid = ImageVector.Builder(
            name = "Snaptogrid",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(0f, 0f)
                lineTo(12f, 0f)
                lineTo(12f, 12f)
                lineTo(0f, 12f)
                lineTo(0f, 0f)
                close()
                moveTo(1f, 1f)
                lineTo(1f, 11f)
                lineTo(11f, 11f)
                lineTo(11f, 1f)
                lineTo(1f, 1f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(0f, 0f)
                    lineTo(12f, 0f)
                    lineTo(12f, 12f)
                    lineTo(0f, 12f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(1f, 1f)
                    lineTo(1f, 11f)
                    lineTo(11f, 11f)
                    lineTo(11f, 1f)
                    lineTo(1f, 1f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(0f, 0f)
                    lineTo(12f, 0f)
                    lineTo(12f, 12f)
                    lineTo(0f, 12f)
                    lineTo(0f, 0f)
                    close()
                    moveTo(1f, 1f)
                    lineTo(1f, 11f)
                    lineTo(11f, 11f)
                    lineTo(11f, 1f)
                    lineTo(1f, 1f)
                    close()
                }
            }
        }.build()

        return _Snaptogrid!!
    }

private var _Snaptogrid: ImageVector? = null

