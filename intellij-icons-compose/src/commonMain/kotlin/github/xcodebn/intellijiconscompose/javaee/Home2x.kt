package github.xcodebn.intellijiconscompose.javaee

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val HomeIcon2x: ImageVector
    get() {
        if (_HomeIcon2x != null) return _HomeIcon2x!!

        _HomeIcon2x = ImageVector.Builder(
            name = "HomeIcon2x",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
            ) {
                moveTo(15f, 11f)
                lineTo(12f, 9f)
                lineTo(8f, 13f)
                lineTo(8f, 15f)
                curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                curveTo(15.00f, 8.88f, 14.84f, 9.73f, 14.54f, 10.51f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 6f)
                lineTo(4f, 4f)
                lineTo(3f, 4f)
                lineTo(3f, 6f)
                lineTo(1f, 6f)
                lineTo(1f, 3f)
                lineTo(6f, 3f)
                lineTo(6f, 6f)
                lineTo(4f, 6f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF000000))
            ) {
                moveTo(4f, 0f)
                lineTo(7f, 3f)
                lineTo(0f, 3f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(2f, 5f)
                lineTo(2f, 1f)
                lineTo(4f, 1f)
                lineTo(4f, 0f)
                lineTo(0f, 0f)
                lineTo(0f, 1f)
                lineTo(2f, 1f)
                lineTo(2f, 5f)
                lineTo(0f, 5f)
                lineTo(0f, 6f)
                lineTo(4f, 6f)
                lineTo(4f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF62B543))
                ) {
                    moveTo(15f, 11f)
                    lineTo(12f, 9f)
                    lineTo(8f, 13f)
                    lineTo(8f, 15f)
                    curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                    curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                    curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                    curveTo(15.00f, 8.88f, 14.84f, 9.73f, 14.54f, 10.51f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 6f)
                    lineTo(4f, 4f)
                    lineTo(3f, 4f)
                    lineTo(3f, 6f)
                    lineTo(1f, 6f)
                    lineTo(1f, 3f)
                    lineTo(6f, 3f)
                    lineTo(6f, 6f)
                    lineTo(4f, 6f)
                    close()
                }
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF000000))
                ) {
                    moveTo(4f, 6f)
                    lineTo(4f, 4f)
                    lineTo(3f, 4f)
                    lineTo(3f, 6f)
                    lineTo(1f, 6f)
                    lineTo(1f, 3f)
                    lineTo(6f, 3f)
                    lineTo(6f, 6f)
                    lineTo(4f, 6f)
                    close()
                }
            }
        }.build()

        return _HomeIcon2x!!
    }

private var _HomeIcon2x: ImageVector? = null

