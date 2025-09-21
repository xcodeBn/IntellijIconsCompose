package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Synchronizescrolling: ImageVector
    get() {
        if (_Synchronizescrolling != null) return _Synchronizescrolling!!

        _Synchronizescrolling = ImageVector.Builder(
            name = "Synchronizescrolling",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(13f, 5f)
                lineTo(15f, 5f)
                lineTo(12f, 8f)
                lineTo(9f, 5f)
                lineTo(11f, 5f)
                lineTo(11f, 1f)
                lineTo(13f, 1f)
                lineTo(13f, 5f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(13f, 12f)
                lineTo(15f, 12f)
                close()
                moveTo(7f, 4f)
                lineTo(2f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(4f, 3f)
                lineTo(8f, 3f)
                lineTo(8f, 13f)
                lineTo(4f, 13f)
                lineTo(4f, 3f)
                close()
                moveTo(5f, 4f)
                lineTo(5f, 12f)
                lineTo(7f, 12f)
                lineTo(7f, 4f)
                lineTo(5f, 4f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(13f, 5f)
                    lineTo(15f, 5f)
                    lineTo(12f, 8f)
                    lineTo(9f, 5f)
                    lineTo(11f, 5f)
                    lineTo(11f, 1f)
                    lineTo(13f, 1f)
                    lineTo(13f, 5f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(13f, 12f)
                    lineTo(15f, 12f)
                    close()
                    moveTo(7f, 4f)
                    lineTo(2f, 4f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(4f, 3f)
                    lineTo(8f, 3f)
                    lineTo(8f, 13f)
                    lineTo(4f, 13f)
                    lineTo(4f, 3f)
                    close()
                    moveTo(5f, 4f)
                    lineTo(5f, 12f)
                    lineTo(7f, 12f)
                    lineTo(7f, 4f)
                    lineTo(5f, 4f)
                    close()
                }
            }
        }.build()

        return _Synchronizescrolling!!
    }

private var _Synchronizescrolling: ImageVector? = null

