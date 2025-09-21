package github.xcodebn.intellijiconscompose.nodes

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Datatables: ImageVector
    get() {
        if (_Datatables != null) return _Datatables!!

        _Datatables = ImageVector.Builder(
            name = "Datatables",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(11f, 13f)
                lineTo(14f, 13f)
                lineTo(14f, 5f)
                lineTo(11f, 5f)
                lineTo(11f, 13f)
                close()
                moveTo(6f, 13f)
                lineTo(10f, 13f)
                lineTo(10f, 5f)
                lineTo(6f, 5f)
                lineTo(6f, 13f)
                close()
                moveTo(2f, 13f)
                lineTo(5f, 13f)
                lineTo(5f, 5f)
                lineTo(2f, 5f)
                lineTo(2f, 13f)
                close()
                moveTo(1f, 14f)
                lineTo(15f, 14f)
                lineTo(15f, 2f)
                lineTo(1f, 2f)
                lineTo(1f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(2f, 8f)
                lineTo(15f, 8f)
                lineTo(15f, 7f)
                lineTo(2f, 7f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF9AA7B0))
            ) {
                moveTo(2f, 11f)
                lineTo(15f, 11f)
                lineTo(15f, 10f)
                lineTo(2f, 10f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF9AA7B0))
                ) {
                    moveTo(11f, 13f)
                    lineTo(14f, 13f)
                    lineTo(14f, 5f)
                    lineTo(11f, 5f)
                    lineTo(11f, 13f)
                    close()
                    moveTo(6f, 13f)
                    lineTo(10f, 13f)
                    lineTo(10f, 5f)
                    lineTo(6f, 5f)
                    lineTo(6f, 13f)
                    close()
                    moveTo(2f, 13f)
                    lineTo(5f, 13f)
                    lineTo(5f, 5f)
                    lineTo(2f, 5f)
                    lineTo(2f, 13f)
                    close()
                    moveTo(1f, 14f)
                    lineTo(15f, 14f)
                    lineTo(15f, 2f)
                    lineTo(1f, 2f)
                    lineTo(1f, 14f)
                    close()
                }
            }
        }.build()

        return _Datatables!!
    }

private var _Datatables: ImageVector? = null

