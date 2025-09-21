package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Field: ImageVector
    get() {
        if (_Field != null) return _Field!!

        _Field = ImageVector.Builder(
            name = "Field",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFFF4AF3D))
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
                moveTo(1f, 8f)
                lineTo(2f, 8f)
                lineTo(2f, 4f)
                lineTo(4f, 4f)
                lineTo(4f, 3f)
                lineTo(2f, 3f)
                curveTo(2.00f, 2.36f, 2.00f, 2.03f, 1.99f, 2.00f)
                curveTo(1.99f, 1.50f, 2.13f, 1.07f, 2.43f, 0.97f)
                curveTo(2.92f, 0.81f, 3.57f, 1.02f, 3.69f, 1.06f)
                lineTo(4f, 0f)
                curveTo(3.91f, 0.20f, 3.46f, 0.00f, 2.81f, 0.00f)
                curveTo(2.17f, 0.00f, 1.82f, 0.06f, 1.48f, 0.39f)
                curveTo(1.17f, 0.70f, 1.02f, 1.22f, 1.00f, 2.00f)
                curveTo(1.00f, 2.04f, 1.00f, 2.95f, 1.00f, 3.00f)
                curveTo(1.00f, 3.02f, 0.67f, 3.02f, 0.00f, 3.00f)
                lineTo(0f, 4f)
                lineTo(1f, 4f)
                lineTo(1f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFFF4AF3D))
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
                    moveTo(1f, 8f)
                    lineTo(2f, 8f)
                    lineTo(2f, 4f)
                    lineTo(4f, 4f)
                    lineTo(4f, 3f)
                    lineTo(2f, 3f)
                    curveTo(2.00f, 2.36f, 2.00f, 2.03f, 1.99f, 2.00f)
                    curveTo(1.99f, 1.50f, 2.13f, 1.07f, 2.43f, 0.97f)
                    curveTo(2.92f, 0.81f, 3.57f, 1.02f, 3.69f, 1.06f)
                    lineTo(4f, 0f)
                    curveTo(3.91f, 0.20f, 3.46f, 0.00f, 2.81f, 0.00f)
                    curveTo(2.17f, 0.00f, 1.82f, 0.06f, 1.48f, 0.39f)
                    curveTo(1.17f, 0.70f, 1.02f, 1.22f, 1.00f, 2.00f)
                    curveTo(1.00f, 2.04f, 1.00f, 2.95f, 1.00f, 3.00f)
                    curveTo(1.00f, 3.02f, 0.67f, 3.02f, 0.00f, 3.00f)
                    lineTo(0f, 4f)
                    lineTo(1f, 4f)
                    lineTo(1f, 8f)
                    close()
                }
            }
        }.build()

        return _Field!!
    }

private var _Field: ImageVector? = null

