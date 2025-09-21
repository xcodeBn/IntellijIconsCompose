package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val InterfaceIcon2x: ImageVector
    get() {
        if (_InterfaceIcon2x != null) return _InterfaceIcon2x!!

        _InterfaceIcon2x = ImageVector.Builder(
            name = "InterfaceIcon2x",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF62B543))
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
                moveTo(8f, 10f)
                lineTo(8f, 6f)
                lineTo(10f, 6f)
                lineTo(10f, 5f)
                lineTo(6f, 5f)
                lineTo(6f, 6f)
                lineTo(8f, 6f)
                lineTo(8f, 10f)
                lineTo(6f, 10f)
                lineTo(6f, 11f)
                lineTo(10f, 11f)
                lineTo(10f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF62B543))
                ) {
                    moveTo(15f, 8f)
                    curveTo(15.00f, 11.87f, 11.87f, 15.00f, 8.00f, 15.00f)
                    curveTo(4.13f, 15.00f, 1.00f, 11.87f, 1.00f, 8.00f)
                    curveTo(1.00f, 4.13f, 4.13f, 1.00f, 8.00f, 1.00f)
                    curveTo(11.87f, 1.00f, 15.00f, 4.13f, 15.00f, 8.00f)
                }
            }
        }.build()

        return _InterfaceIcon2x!!
    }

private var _InterfaceIcon2x: ImageVector? = null

