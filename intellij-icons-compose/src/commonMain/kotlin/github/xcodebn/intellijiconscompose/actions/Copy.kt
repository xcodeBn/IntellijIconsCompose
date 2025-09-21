package github.xcodebn.intellijiconscompose.actions

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Copy: ImageVector
    get() {
        if (_Copy != null) return _Copy!!

        _Copy = ImageVector.Builder(
            name = "Copy",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(11f, 3f)
                lineTo(4f, 3f)
                lineTo(4f, 11f)
                lineTo(2f, 11f)
                lineTo(2f, 1f)
                lineTo(11f, 1f)
                lineTo(11f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(5f, 4f)
                lineTo(14f, 4f)
                lineTo(14f, 14f)
                lineTo(5f, 14f)
                lineTo(5f, 4f)
                close()
                moveTo(7f, 6f)
                lineTo(7f, 7f)
                lineTo(12f, 7f)
                lineTo(12f, 6f)
                lineTo(7f, 6f)
                close()
                moveTo(7f, 10f)
                lineTo(7f, 11f)
                lineTo(12f, 11f)
                lineTo(12f, 10f)
                lineTo(7f, 10f)
                close()
                moveTo(7f, 8f)
                lineTo(7f, 9f)
                lineTo(12f, 9f)
                lineTo(12f, 8f)
                lineTo(7f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(11f, 3f)
                    lineTo(4f, 3f)
                    lineTo(4f, 11f)
                    lineTo(2f, 11f)
                    lineTo(2f, 1f)
                    lineTo(11f, 1f)
                    lineTo(11f, 3f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(5f, 4f)
                    lineTo(14f, 4f)
                    lineTo(14f, 14f)
                    lineTo(5f, 14f)
                    lineTo(5f, 4f)
                    close()
                    moveTo(7f, 6f)
                    lineTo(7f, 7f)
                    lineTo(12f, 7f)
                    lineTo(12f, 6f)
                    lineTo(7f, 6f)
                    close()
                    moveTo(7f, 10f)
                    lineTo(7f, 11f)
                    lineTo(12f, 11f)
                    lineTo(12f, 10f)
                    lineTo(7f, 10f)
                    close()
                    moveTo(7f, 8f)
                    lineTo(7f, 9f)
                    lineTo(12f, 9f)
                    lineTo(12f, 8f)
                    lineTo(7f, 8f)
                    close()
                }
            }
        }.build()

        return _Copy!!
    }

private var _Copy: ImageVector? = null

