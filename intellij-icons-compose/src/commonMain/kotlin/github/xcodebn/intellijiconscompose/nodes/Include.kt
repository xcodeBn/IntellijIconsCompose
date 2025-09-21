package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Include: ImageVector
    get() {
        if (_Include != null) return _Include!!

        _Include = ImageVector.Builder(
            name = "Include",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(8f, 1f)
                lineTo(8f, 4f)
                lineTo(12f, 4f)
                lineTo(12f, 8f)
                lineTo(8f, 8f)
                lineTo(8f, 12f)
                lineTo(4f, 12f)
                lineTo(4f, 8f)
                lineTo(1f, 8f)
                curveTo(1.00f, 11.87f, 4.13f, 15.00f, 8.00f, 15.00f)
                curveTo(11.87f, 15.00f, 15.00f, 11.87f, 15.00f, 8.00f)
                curveTo(15.00f, 4.13f, 11.87f, 1.00f, 8.00f, 1.00f)
            }
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(4f, 4f)
                lineTo(4f, 2f)
                curveTo(3.32f, 2.73f, 2.73f, 3.32f, 2.26f, 4.00f)
                lineTo(4f, 4f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(11f, 5f)
                lineTo(7f, 5f)
                lineTo(7f, 1f)
                lineTo(5f, 1f)
                lineTo(5f, 5f)
                lineTo(1f, 5f)
                lineTo(1f, 7f)
                lineTo(5f, 7f)
                lineTo(5f, 11f)
                lineTo(7f, 11f)
                lineTo(7f, 7f)
                lineTo(11f, 7f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF40B6E0))
                ) {
                    moveTo(8f, 1f)
                    lineTo(8f, 4f)
                    lineTo(12f, 4f)
                    lineTo(12f, 8f)
                    lineTo(8f, 8f)
                    lineTo(8f, 12f)
                    lineTo(4f, 12f)
                    lineTo(4f, 8f)
                    lineTo(1f, 8f)
                    curveTo(1.00f, 11.87f, 4.13f, 15.00f, 8.00f, 15.00f)
                    curveTo(11.87f, 15.00f, 15.00f, 11.87f, 15.00f, 8.00f)
                    curveTo(15.00f, 4.13f, 11.87f, 1.00f, 8.00f, 1.00f)
                }
                path(
                    fill = SolidColor(Color(0xFF40B6E0))
                ) {
                    moveTo(4f, 4f)
                    lineTo(4f, 2f)
                    curveTo(3.32f, 2.73f, 2.73f, 3.32f, 2.26f, 4.00f)
                    lineTo(4f, 4f)
                    close()
                }
            }
        }.build()

        return _Include!!
    }

private var _Include: ImageVector? = null

