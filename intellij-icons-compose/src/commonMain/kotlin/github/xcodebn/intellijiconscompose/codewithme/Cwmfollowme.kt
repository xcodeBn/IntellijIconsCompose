package github.xcodebn.intellijiconscompose.codewithme

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.group
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Cwmfollowme: ImageVector
    get() {
        if (_Cwmfollowme != null) return _Cwmfollowme!!

        _Cwmfollowme = ImageVector.Builder(
            name = "Cwmfollowme",
            defaultWidth = 16.0.dp,
            defaultHeight = 16.0.dp,
            viewportWidth = 16.0f,
            viewportHeight = 16.0f
        ).apply {
            path(
                fill = SolidColor(Color(0xFF6E6E6E))
            ) {
                moveTo(5f, 2f)
                lineTo(2f, 2f)
                close()
                moveTo(3f, 13f)
                lineTo(2f, 14f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF59A869))
            ) {
                moveTo(9f, 11f)
                lineTo(10f, 10f)
                lineTo(8f, 8f)
                lineTo(10f, 5f)
                lineTo(9f, 4f)
                lineTo(6f, 8f)
                lineTo(9f, 11f)
                close()
                moveTo(10f, 8f)
                lineTo(13f, 4f)
                lineTo(14f, 5f)
                lineTo(12f, 8f)
                lineTo(14f, 10f)
                lineTo(13f, 11f)
                lineTo(10f, 8f)
                close()
            }
            group() {
                path(
                    fill = SolidColor(Color(0xFF6E6E6E))
                ) {
                    moveTo(5f, 2f)
                    lineTo(2f, 2f)
                    close()
                    moveTo(3f, 13f)
                    lineTo(2f, 14f)
                    close()
                }
                path(
                    fill = SolidColor(Color(0xFF59A869))
                ) {
                    moveTo(9f, 11f)
                    lineTo(10f, 10f)
                    lineTo(8f, 8f)
                    lineTo(10f, 5f)
                    lineTo(9f, 4f)
                    lineTo(6f, 8f)
                    lineTo(9f, 11f)
                    close()
                    moveTo(10f, 8f)
                    lineTo(13f, 4f)
                    lineTo(14f, 5f)
                    lineTo(12f, 8f)
                    lineTo(14f, 10f)
                    lineTo(13f, 11f)
                    lineTo(10f, 8f)
                    close()
                }
            }
        }.build()

        return _Cwmfollowme!!
    }

private var _Cwmfollowme: ImageVector? = null

