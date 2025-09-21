package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Enterpriseproject: ImageVector
    get() {
        if (_Enterpriseproject != null) return _Enterpriseproject!!

        _Enterpriseproject = ImageVector.Builder(
            name = "Enterpriseproject",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFFFFFFF))
            ) {
                moveTo(7f, 8f)
                curveTo(7.73f, 8.37f, 8.30f, 8.70f, 8.86f, 8.70f)
                curveTo(9.52f, 8.70f, 9.75f, 8.02f, 9.75f, 7.62f)
                lineTo(10f, 3f)
                lineTo(11f, 3f)
                lineTo(11f, 8f)
                curveTo(11.00f, 9.05f, 10.21f, 10.00f, 9.06f, 10.00f)
                curveTo(7.62f, 10.00f, 7.14f, 9.57f, 6.70f, 8.95f)
                lineTo(7f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFFFFFFF))
                ) {
                    moveTo(7f, 8f)
                    curveTo(7.73f, 8.37f, 8.30f, 8.70f, 8.86f, 8.70f)
                    curveTo(9.52f, 8.70f, 9.75f, 8.02f, 9.75f, 7.62f)
                    lineTo(10f, 3f)
                    lineTo(11f, 3f)
                    lineTo(11f, 8f)
                    curveTo(11.00f, 9.05f, 10.21f, 10.00f, 9.06f, 10.00f)
                    curveTo(7.62f, 10.00f, 7.14f, 9.57f, 6.70f, 8.95f)
                    lineTo(7f, 8f)
                    close()
                }
            }
        }.build()

        return _Enterpriseproject!!
    }

private var _Enterpriseproject: ImageVector? = null

