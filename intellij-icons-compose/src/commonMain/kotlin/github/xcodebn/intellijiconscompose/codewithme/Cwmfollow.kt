package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmfollow: ImageVector
    get() {
        if (_Cwmfollow != null) return _Cwmfollow!!

        _Cwmfollow = ImageVector.Builder(
            name = "Cwmfollow",
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
                moveTo(9f, 8f)
                lineTo(6f, 4f)
                lineTo(5f, 5f)
                lineTo(7f, 8f)
                lineTo(5f, 10f)
                lineTo(6f, 11f)
                lineTo(9f, 8f)
                close()
                moveTo(2f, 11f)
                lineTo(1f, 10f)
                lineTo(3f, 8f)
                lineTo(1f, 5f)
                lineTo(2f, 4f)
                lineTo(5f, 8f)
                lineTo(2f, 11f)
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
                    moveTo(9f, 8f)
                    lineTo(6f, 4f)
                    lineTo(5f, 5f)
                    lineTo(7f, 8f)
                    lineTo(5f, 10f)
                    lineTo(6f, 11f)
                    lineTo(9f, 8f)
                    close()
                    moveTo(2f, 11f)
                    lineTo(1f, 10f)
                    lineTo(3f, 8f)
                    lineTo(1f, 5f)
                    lineTo(2f, 4f)
                    lineTo(5f, 8f)
                    lineTo(2f, 11f)
                    close()
                }
            }
        }.build()

        return _Cwmfollow!!
    }

private var _Cwmfollow: ImageVector? = null

