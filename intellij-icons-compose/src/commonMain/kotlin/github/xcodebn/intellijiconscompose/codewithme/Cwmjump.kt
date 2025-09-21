package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmjump: ImageVector
    get() {
        if (_Cwmjump != null) return _Cwmjump!!

        _Cwmjump = ImageVector.Builder(
            name = "Cwmjump",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(10f, 14f)
                lineTo(15f, 14f)
                lineTo(15f, 13f)
                lineTo(11f, 13f)
                lineTo(10f, 14f)
                close()
                moveTo(13f, 2f)
                lineTo(10f, 2f)
                lineTo(10f, 13f)
                lineTo(13f, 10f)
                lineTo(13f, 2f)
                close()
                moveTo(12f, 3f)
                lineTo(12f, 10f)
                lineTo(11f, 11f)
                lineTo(11f, 3f)
                lineTo(12f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF389FD6))
            ) {
                moveTo(5f, 11f)
                lineTo(4f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(10f, 14f)
                    lineTo(15f, 14f)
                    lineTo(15f, 13f)
                    lineTo(11f, 13f)
                    lineTo(10f, 14f)
                    close()
                    moveTo(13f, 2f)
                    lineTo(10f, 2f)
                    lineTo(10f, 13f)
                    lineTo(13f, 10f)
                    lineTo(13f, 2f)
                    close()
                    moveTo(12f, 3f)
                    lineTo(12f, 10f)
                    lineTo(11f, 11f)
                    lineTo(11f, 3f)
                    lineTo(12f, 3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF389FD6))
                ) {
                    moveTo(5f, 11f)
                    lineTo(4f, 10f)
                    close()
                }
            }
        }.build()

        return _Cwmjump!!
    }

private var _Cwmjump: ImageVector? = null

