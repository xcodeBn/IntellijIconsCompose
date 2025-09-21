package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val EnumIcon2x: ImageVector
    get() {
        if (_EnumIcon2x != null) return _EnumIcon2x!!

        _EnumIcon2x = ImageVector.Builder(
            name = "EnumIcon2x",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF40B6E0))
            ) {
                moveTo(15f, 8f)
                curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
            }
            path(
                fill = SolidColor(Color(0xFF231F20))
            ) {
                moveTo(4f, 6f)
                lineTo(0f, 6f)
                lineTo(0f, 0f)
                lineTo(4f, 0f)
                lineTo(4f, 1f)
                lineTo(1f, 1f)
                lineTo(1f, 2f)
                lineTo(4f, 2f)
                lineTo(4f, 3f)
                lineTo(1f, 3f)
                lineTo(1f, 5f)
                lineTo(4f, 5f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF40B6E0))
                ) {
                    moveTo(15f, 8f)
                    curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                    curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                    curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                    curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                }
            }
        }.build()

        return _EnumIcon2x!!
    }

private var _EnumIcon2x: ImageVector? = null

